package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Pizzas.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractPizza MargheritaPizza = new MargheritaPizza(0.00);
		String PrintInformation = MargheritaPizza.toString();
		System.out.println(PrintInformation);
		

	}

}
