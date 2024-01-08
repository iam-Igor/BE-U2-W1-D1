package ygorgarofalo.BEU2W1D1.entities;

public class Drinks {


    private String drinkName;
    private double price;
    private int calories;

    public Drinks(String drinkName) {
        this.drinkName = drinkName;
        this.price = setPrice();
        this.calories = setCalories();
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice() {
        switch (drinkName) {
            case "Lemonade", "Water": {
                return this.price = 1.29;
            }
            case "Wine": {
                this.price = 7.49;
            }
            default:
                return price;
        }
    }

    public int getCalories() {
        return calories;
    }

    public int setCalories() {
        switch (drinkName) {
            case "Lemonade": {
                return this.calories = 128;
            }
            case "Water": {
                return this.calories = 0;
            }
            case "Wine": {
                return this.calories = 607;
            }
            default:
                return calories;
        }
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
