package ygorgarofalo.BEU2W1D1.entities;


public class Pizza {


    private String pizzaName;
    private String baseIngredients = "Tomato, Cheese";
    private String additionalIngredients;
    private Double price;

    private int calories;

    private Toppings topping = null;

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        this.baseIngredients = getBaseIngredients();
        this.additionalIngredients = setAdditionalIngredients();
        this.price = setPrice();
        this.calories = setCalories();
        this.topping = getTopping();
    }

    public Toppings getTopping() {
        return topping;
    }

    public void setTopping(Toppings topping) {
        this.topping = topping;
    }

    public void addTopping(Toppings topping) {

        this.price += topping.getPrice();

    }

    public int getCalories() {
        return calories;
    }

    public int setCalories() {
        switch (this.pizzaName) {
            case "Hawaiaan": {
                return 1024;
            }
            case "Salami": {
                return 1160;
            }
            default:
                return 1104;
        }
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getBaseIngredients() {
        return baseIngredients;
    }

    public String setBaseIngredients() {
        return baseIngredients;
    }

    public String getAdditionalIngredients() {
        return additionalIngredients;
    }

    public String setAdditionalIngredients() {
        switch (this.pizzaName) {
            case "Hawaiian": {
                return "Ham,Pineapple";
            }
            case "Salami": {
                return "Salami";
            }
            default:
                return null;
        }
    }

    public Double getPrice() {
        return price;
    }

    public Double setPrice() {
        switch (this.pizzaName) {
            case "Hawaiian": {
                return this.price = 6.49;
            }
            case "Salami": {
                return this.price = 5.99;
            }
            default:
                return this.price = 4.99;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", baseIngredients='" + baseIngredients + '\'' +
                ", additionalIngredients='" + additionalIngredients + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}



