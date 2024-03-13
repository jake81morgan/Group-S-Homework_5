package edu.mu.PizzaProject.Strategies;

import edu.mu.PizzaProject.Pizzas.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {

		ConventionalOvenCookingStrategy ConventionalOvenCookingStrategy = new ConventionalOvenCookingStrategy();
		pizza.setCookingPrice(8.0);
		pizza.setTotalPrice(pizza.getCookingPrice() + pizza.getTotalPrice());
		pizza.setCookingStrategy(ConventionalOvenCookingStrategy);
		return true;

	}

}
