package edu.mu.PizzaProject.Pizzas;

import edu.mu.PizzaProject.Enums.Toppings;

public class VegetarianPizza extends AbstractPizza {
	public VegetarianPizza(double PriceWithoutToppings) {
		super(1.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.BELL_PEPPER);
        toppingList.add(Toppings.BLACK_OLIVE);
        toppingList.add(Toppings.MUSHROOM);
        updatePizzaPrice();
    }
}
