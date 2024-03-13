package edu.mu.PizzaProject.Pizzas;

import java.util.ArrayList;

import edu.mu.PizzaProject.Enums.Toppings;

public class SupremePizza extends AbstractPizza {
	public SupremePizza() {
		super();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.ITALIAN_SAUSAGE);
		toppingList.add(Toppings.PEPPERONI);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		priceWithoutToppings = 3.50;
		updatePizzaPrice();
	}

	/**
	 * TODO: Copy contructor
	 * @param pizza
	 */
	public SupremePizza(SupremePizza pizza) {
			super();
			this.toppingList = new ArrayList<>(pizza.toppingList);
			this.priceWithoutToppings = pizza.priceWithoutToppings;
			this.totalPrice = pizza.totalPrice;
			this.cookingStrategy = pizza.cookingStrategy;
			this.cookingPrice = pizza.cookingPrice;
		}
}
