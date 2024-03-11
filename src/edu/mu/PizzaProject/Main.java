package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Pizzas.*;
import edu.mu.PizzaProject.Strategies.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrickOvenCookingStrategy brickOvenCookingStrategy = new BrickOvenCookingStrategy();
		ConventionalOvenCookingStrategy ConventionalOvenCookingStrategy = new ConventionalOvenCookingStrategy();
		MicrowaveCookingStrategy MicrowaveCookingStrategy = new MicrowaveCookingStrategy();
		// Testing the classes
        AbstractPizza margheritaPizza = new MargheritaPizza();
        brickOvenCookingStrategy.cook(margheritaPizza);
        System.out.println("Margherita Pizza:");
        System.out.println(margheritaPizza);

        VegetarianPizza vegetarianPizza = new VegetarianPizza();
        MicrowaveCookingStrategy.cook(vegetarianPizza);
        System.out.println("\nVegetarian Pizza:");
        System.out.println(vegetarianPizza);

        HawaiianPizza hawaiianPizza = new HawaiianPizza();
        ConventionalOvenCookingStrategy.cook(hawaiianPizza);
        System.out.println("\nHawaiian Pizza:");
        System.out.println(hawaiianPizza);

        SupremePizza supremePizza = new SupremePizza();
        brickOvenCookingStrategy.cook(supremePizza);
        System.out.println("\nSupreme Pizza:");
        System.out.println(supremePizza);

	}

}
