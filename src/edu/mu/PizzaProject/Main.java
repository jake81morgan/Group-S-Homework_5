package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Pizzas.*;
import edu.mu.PizzaProject.Strategies.BrickOvenCookingStrategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing the classes
        MargheritaPizza margheritaPizza = new MargheritaPizza();
        BrickOvenCookingStrategy brickOvenCookingStrategy = new BrickOvenCookingStrategy();
        margheritaPizza.setCookingStrategy(brickOvenCookingStrategy);
        System.out.println("Margherita Pizza:");
        System.out.println(margheritaPizza);

//        VegetarianPizza vegetarianPizza = new VegetarianPizza();
//        System.out.println("\nVegetarian Pizza:");
//        System.out.println(vegetarianPizza);
//
//        HawaiianPizza hawaiianPizza = new HawaiianPizza();
//        System.out.println("\nHawaiian Pizza:");
//        System.out.println(hawaiianPizza);
//
//        SupremePizza supremePizza = new SupremePizza();
//        System.out.println("\nSupreme Pizza:");
//        System.out.println(supremePizza);

	}

}
