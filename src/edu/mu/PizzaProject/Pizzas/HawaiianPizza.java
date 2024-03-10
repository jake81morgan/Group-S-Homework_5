package edu.mu.PizzaProject.Pizzas;

import edu.mu.PizzaProject.Enums.Toppings;

public class HawaiianPizza extends AbstractPizza {
	public HawaiianPizza(double PriceWithoutToppings) {
		super(3.00);
        toppingList.add(Toppings.CANADIAN_BACON);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.PINEAPPLE);
        updatePizzaPrice();
    }
}
