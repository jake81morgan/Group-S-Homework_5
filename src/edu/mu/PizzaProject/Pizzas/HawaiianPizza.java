package edu.mu.PizzaProject.Pizzas;

import java.util.ArrayList;

import edu.mu.PizzaProject.Enums.Toppings;

public class HawaiianPizza extends AbstractPizza {
	public HawaiianPizza() {
		super();
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		priceWithoutToppings = 3.00;
		updatePizzaPrice();
	}

	/**
	 * TODO: Copy contructor
	 * @param pizza
	 */
	public HawaiianPizza(HawaiianPizza pizza) {
		super();
		this.toppingList = new ArrayList<>(pizza.toppingList);
		this.priceWithoutToppings = pizza.priceWithoutToppings;
		this.totalPrice = pizza.totalPrice;
		this.cookingStrategy = pizza.cookingStrategy;
		this.cookingPrice = pizza.cookingPrice;
	}
}
