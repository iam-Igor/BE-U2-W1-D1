package ygorgarofalo.BEU2W1D1.entities;


public class Toppings {

    private String toppingName;
    private double price;
    private int calories;


    public Toppings(String toppingName) {
        this.toppingName = toppingName;
        this.calories = setCalories();
        this.price = setPrice();
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice() {
        switch (toppingName) {
            case "Cheese", "Onions": {
                return this.price = 0.69;

            }
            case "Ham", "Salami": {
                return this.price = 0.99;

            }
            case "Pineapple": {
                return this.price = 0.79;
            }
            default:
                return price;
        }
    }

    public int getCalories() {
        return calories;
    }

    public int setCalories() {
        switch (toppingName) {
            case "Cheese": {
                return this.calories = 92;
            }
            case "Ham": {
                return this.calories = 35;
            }
            case "Onions": {
                return this.calories = 22;
            }
            case "Pineapple": {
                return this.calories = 24;
            }
            case "Salami": {
                return this.calories = 86;
            }
            default:
                return calories;
        }
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingName='" + toppingName + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
