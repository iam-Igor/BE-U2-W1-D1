package ygorgarofalo.BEU2W1D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ygorgarofalo.BEU2W1D1.entities.Drinks;
import ygorgarofalo.BEU2W1D1.entities.Menu;
import ygorgarofalo.BEU2W1D1.entities.Pizza;
import ygorgarofalo.BEU2W1D1.entities.Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class BeU2W1D1Application {


    public static void main(String[] args) {
        SpringApplication.run(BeU2W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeU2W1D1Application.class);

        Menu m = (Menu) ctx.getBean("printMenu");


        System.out.println("----Pizze nel menu: ----");

        for (Pizza pizza : m.getPizzas()) {
            System.out.println("Pizza: " + pizza.getPizzaName() + ", " + "Price: " + pizza.getPrice() + ", " + "Calories: " + pizza.getCalories());
        }

        System.out.println("----Toppings nel menu: ----");
        for (Toppings toppings : m.getToppings()) {
            System.out.println("Topping: " + toppings.getToppingName() + ", " + "Price: " + toppings.getPrice() + ", " + "Calories: " + toppings.getCalories());
        }

        System.out.println("----Drinks nel menu: ----");
        for (Drinks drinks : m.getDrinks()) {
            System.out.println("Drink: " + drinks.getDrinkName() + ", " + "Price: " + drinks.getPrice() + ", " + "Calories: " + drinks.getCalories());
        }


        placeOrder();

    }

    public static void placeOrder() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeU2W1D1Application.class);

        Pizza margheritaPizza = ctx.getBean("getMargheritaPizza", Pizza.class);
        Pizza hawaiianPizza = ctx.getBean("getHawaiianPizza", Pizza.class);
        Pizza salamiPizza = ctx.getBean("getSalamiPizza", Pizza.class);

        Toppings cheese = ctx.getBean("getCheese", Toppings.class);
        Toppings ham = ctx.getBean("getHam", Toppings.class);
        Toppings onions = ctx.getBean("getOnions", Toppings.class);
        Toppings pineapple = ctx.getBean("getPineapple", Toppings.class);
        Toppings salami = ctx.getBean("getSalami", Toppings.class);

        Drinks lemonade = ctx.getBean("getLemonade", Drinks.class);
        Drinks water = ctx.getBean("getWater", Drinks.class);
        Drinks wine = ctx.getBean("getWine", Drinks.class);


        List<Pizza> pizzaList = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Order number 1 - Pizza e drink sono obbligatori");

        System.out.println("Quale pizza vuoi?");

        System.out.println("1 - Margherita");
        System.out.println("2 - Hawaiian");
        System.out.println("3 - Salami");

        int choosenPizzas = userInput.nextInt();

        switch (choosenPizzas) {
            case 1: {
                pizzaList.add(margheritaPizza);
                break;
            }
            case 2: {
                pizzaList.add(hawaiianPizza);
                break;
            }
            case 3: {
                pizzaList.add(salamiPizza);
                break;
            }
            default:
                System.out.println("Comando non riconosciuto");
        }


        System.out.println("Quale drink vuoi?");
        System.out.println("1 - Lemonade");
        System.out.println("2 - Water");
        System.out.println("3 - Wine");

        List<Drinks> drinksList = new ArrayList<>();
        int choosenDrink = userInput.nextInt();


        switch (choosenDrink) {
            case 1:
                drinksList.add(lemonade);
                break;
            case 2:
                drinksList.add(water);
                break;
            case 3:
                drinksList.add(wine);
                break;
            default:
                System.out.println("Comando non riconosciuto");
        }


        System.out.println("Vuoi aggiungere un extra topping? Premi 1 per SI o 2 per NO");
        int choosenOption = userInput.nextInt();

        switch (choosenOption) {
            case 1: {
                System.out.println("Cosa vuoi aggiungere?");
                System.out.println("1 - Cheese");
                System.out.println("2 - Ham");
                System.out.println("3 - Onions");
                System.out.println("4 - Pineapple");
                System.out.println("5 - Salami");

                int choosenTopping = userInput.nextInt();

                switch (choosenTopping) {
                    case 1: {
                        pizzaList.get(0).addTopping(cheese);
                        System.out.println("Totale da pagare: " + (pizzaList.get(0).getPrice() + cheese.getPrice() + drinksList.get(0).getPrice()));
                        break;
                    }
                    case 2: {
                        pizzaList.get(0).addTopping(ham);
                        System.out.println("Totale da pagare: " + (pizzaList.get(0).getPrice() + ham.getPrice() + drinksList.get(0).getPrice()));

                        break;
                    }
                    case 3: {
                        pizzaList.get(0).addTopping(onions);
                        System.out.println("Totale da pagare: " + (pizzaList.get(0).getPrice() + onions.getPrice() + drinksList.get(0).getPrice()));

                        break;
                    }
                    case 4: {
                        pizzaList.get(0).addTopping(pineapple);
                        System.out.println("Totale da pagare: " + (pizzaList.get(0).getPrice() + pineapple.getPrice() + drinksList.get(0).getPrice()));

                        break;
                    }
                    case 5: {
                        pizzaList.get(0).addTopping(salami);
                        System.out.println("Totale da pagare: " + (pizzaList.get(0).getPrice() + salami.getPrice() + drinksList.get(0).getPrice()));

                        break;
                    }
                    default:
                        System.out.println("Comando non riconosciuto");
                }
            }
            break;

            case 2: {
                System.out.println("Ok, totale da pagare: " + (pizzaList.get(0).getPrice() + drinksList.get(0).getPrice()) + " $");
                break;
            }
            default:
                System.out.println("Comando non riconosciuto");
        }


    }


}
