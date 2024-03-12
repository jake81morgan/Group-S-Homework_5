package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Enums.PizzaType;
import edu.mu.PizzaProject.Pizzas.*;

public class PizzaCookingFactory {

	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		switch (pizzaType) {
			case HAWAIIAN:
				return  new HawaiianPizza();
			case MARGHERITA:
				return  new MargheritaPizza();
			case SUPREME:
				return new SupremePizza();
			case VEGETARIAN:
				return new VegetarianPizza();
			default:
				throw new IllegalArgumentException("Invalid Pizza Type" + pizzaType);
		}

	}
}
