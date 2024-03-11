package edu.mu.PizzaProject.Pizzas;

import java.util.ArrayList;

import edu.mu.PizzaProject.Enums.Toppings;

public class MargheritaPizza extends AbstractPizza {
	public MargheritaPizza() {
		super();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		priceWithoutToppings = 2.50;
		updatePizzaPrice();
	}

	// Copy constructor
	public MargheritaPizza(MargheritaPizza pizza) {
		super();
		this.toppingList = new ArrayList<>(pizza.toppingList);
		this.priceWithoutToppings = pizza.priceWithoutToppings;
		this.totalPrice = pizza.totalPrice;
		this.cookingStrategy = pizza.cookingStrategy;
		this.cookingPrice = pizza.cookingPrice;
	}
}
