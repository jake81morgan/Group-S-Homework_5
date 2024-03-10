package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Pizzas.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing the classes
        MargheritaPizza margheritaPizza = new MargheritaPizza(0.00);
        System.out.println("Margherita Pizza:");
        System.out.println(margheritaPizza);

        VegetarianPizza vegetarianPizza = new VegetarianPizza(0.00);
        System.out.println("\nVegetarian Pizza:");
        System.out.println(vegetarianPizza);

        HawaiianPizza hawaiianPizza = new HawaiianPizza(0.00);
        System.out.println("\nHawaiian Pizza:");
        System.out.println(hawaiianPizza);

        SupremePizza supremePizza = new SupremePizza(0.00);
        System.out.println("\nSupreme Pizza:");
        System.out.println(supremePizza);

	}

}
