package edu.mu.PizzaProject.Strategies;

import edu.mu.PizzaProject.Pizzas.AbstractPizza;

public interface ICookingStrategy {

	public boolean cook(AbstractPizza pizza);
	 
}
