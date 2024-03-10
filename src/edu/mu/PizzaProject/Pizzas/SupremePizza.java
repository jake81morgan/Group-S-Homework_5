package edu.mu.PizzaProject.Pizzas;

import edu.mu.PizzaProject.Enums.Toppings;

public class SupremePizza extends AbstractPizza {
	public SupremePizza(double PriceWithoutToppings) {
		super(3.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.BELL_PEPPER);
        toppingList.add(Toppings.ITALIAN_SAUSAGE);
        toppingList.add(Toppings.PEPPERONI);
        toppingList.add(Toppings.BLACK_OLIVE);
        toppingList.add(Toppings.MUSHROOM);
        updatePizzaPrice();
    }
}
