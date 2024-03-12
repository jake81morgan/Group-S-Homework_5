package edu.mu.PizzaProject;

import edu.mu.PizzaProject.Enums.*;
import edu.mu.PizzaProject.Pizzas.*;
import edu.mu.PizzaProject.Strategies.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrder Order = new PizzaOrder();

		// Adds pizzas to the cart
		Order.addPizzaToCart(PizzaType.HAWAIIAN);
		Order.addPizzaToCart(PizzaType.VEGETARIAN);
		Order.addPizzaToCart(PizzaType.MARGHERITA);

		// Selects cooking strategies for the pizzas in the cart
		Order.selectCookingStrategyByPizzaOrderID(0, CookingStyleType.MICROWAVE);
		Order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.CONVENTIONAL_OVEN);
		Order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.CONVENTIONAL_OVEN);

		// Prints pizza order cart
		Order.printPizzaOrderCart(1);

		// Prints toppings for a specific pizza order ID
		Order.printListOfToppingsByPizzaOrderID(0);

		// Add new topping to a pizza
		Order.addNewToppingToPizza(0, Toppings.BELL_PEPPER);

		// Remove topping from a pizza
		Order.removeToppingFromPizza(1, Toppings.TOMATO);

		// Attempt to checkout
		try {
			double totalBill = Order.checkout();
			System.out.println("Total Bill: $" + totalBill);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
