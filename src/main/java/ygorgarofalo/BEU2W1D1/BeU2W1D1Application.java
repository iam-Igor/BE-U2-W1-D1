package ygorgarofalo.BEU2W1D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ygorgarofalo.BEU2W1D1.entities.Drinks;
import ygorgarofalo.BEU2W1D1.entities.Menu;
import ygorgarofalo.BEU2W1D1.entities.Pizza;
import ygorgarofalo.BEU2W1D1.entities.Toppings;

@SpringBootApplication
public class BeU2W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeU2W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeU2W1D1Application.class);

        Menu m = (Menu) ctx.getBean("printMenu");

        System.out.println("----Pizze nel menu: ----");

        for (Pizza pizza : m.getPizzas()) {
            System.out.println("Pizza: " + pizza.getPizzaName());
        }

        System.out.println("----Toppings nel menu: ----");
        for (Toppings toppings : m.getToppings()) {
            System.out.println("Topping: " + toppings.getToppingName());
        }

        System.out.println("----Drinks nel menu: ----");
        for (Drinks drinks : m.getDrinks()) {
            System.out.println("Drink: " + drinks.getDrinkName());
        }
    }

}
