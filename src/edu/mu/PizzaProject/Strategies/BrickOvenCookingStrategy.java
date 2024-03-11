package edu.mu.PizzaProject.Strategies;

import edu.mu.PizzaProject.Pizzas.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		BrickOvenCookingStrategy brickOvenCookingStrategy = new BrickOvenCookingStrategy();
		pizza.setCookingPrice(10.0);
		pizza.setTotalPrice(pizza.getCookingPrice() + pizza.getTotalPrice());
		pizza.setCookingStrategy(brickOvenCookingStrategy);
		return true;
	}

}
