package edu.mu.PizzaProject.Pizzas;

import edu.mu.PizzaProject.Enums.Toppings;

public class MargheritaPizza extends AbstractPizza {
	public MargheritaPizza(double PriceWithoutToppings) {
		super(2.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        updatePizzaPrice();
    }
}
