package edu.mu.PizzaProject.Strategies;

import edu.mu.PizzaProject.Pizzas.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		pizza.setCookingPrice(1.0);
		pizza.setTotalPrice(pizza.getCookingPrice() + pizza.getTotalPrice());
		return true;

	}

}
