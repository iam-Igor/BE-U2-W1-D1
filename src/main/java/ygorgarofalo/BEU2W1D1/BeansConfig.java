package ygorgarofalo.BEU2W1D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ygorgarofalo.BEU2W1D1.entities.Drinks;
import ygorgarofalo.BEU2W1D1.entities.Menu;
import ygorgarofalo.BEU2W1D1.entities.Pizza;
import ygorgarofalo.BEU2W1D1.entities.Toppings;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    Pizza getMargheritaPizza() {
        return new Pizza("Margherita");
    }

    @Bean
    Pizza getHawaiianPizza() {
        return new Pizza("Hawaiian");
    }

    @Bean
    Pizza getSalamiPizza() {
        return new Pizza("Salami");
    }

    @Bean
    Toppings getCheese() {
        return new Toppings("Cheese");
    }

    @Bean
    Toppings getHam() {
        return new Toppings("Ham");
    }

    @Bean
    Toppings getOnions() {
        return new Toppings("Onions");
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple");
    }

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami");
    }

    @Bean
    Drinks getLemonade() {
        return new Drinks("Lemonade");
    }

    @Bean
    Drinks getWater() {
        return new Drinks("Water");
    }

    @Bean
    Drinks getWine() {
        return new Drinks("Wine");
    }

    @Bean
    Menu printMenu() {
        List<Pizza> pizzaList = Arrays.asList(getMargheritaPizza(), getHawaiianPizza(), getSalamiPizza());
        List<Toppings> toppingsList = Arrays.asList(getCheese(), getHam(), getOnions(), getPineapple(), getSalami());
        List<Drinks> drinksList = Arrays.asList(getLemonade(), getWater(), getWine());


        return new Menu(pizzaList, toppingsList, drinksList);
    }
}
