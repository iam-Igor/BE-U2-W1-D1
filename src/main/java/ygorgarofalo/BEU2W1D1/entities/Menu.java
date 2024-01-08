package ygorgarofalo.BEU2W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class Menu {

    private List<Pizza> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;


}
