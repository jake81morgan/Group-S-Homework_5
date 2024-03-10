package edu.mu.PizzaProject.Pizzas;

import java.util.ArrayList;
import java.util.List;

import edu.mu.PizzaProject.Enums.*;
import edu.mu.PizzaProject.Strategies.ICookingStrategy;

public abstract class AbstractPizza {

	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;

	/**
	 * TODO: Constructor for AbstractPizza class
	 */
	public AbstractPizza(double PriceWithoutToppings) {
		this.priceWithoutToppings = PriceWithoutToppings;
		this.totalPrice = PriceWithoutToppings;
		toppingList = new ArrayList<Toppings>();

	}

	// Getters and Setters
	public List<Toppings> getToppingList() {
		return toppingList;
	}

	// Sets the list of toppings
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}

	// Gets the Price without the Toppings added
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	// Sets the Price without the Toppings added
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}

	// Gets the Total Price
	public double getTotalPrice() {
		return totalPrice;
	}

	// Sets the Total Price
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	// Gets the Order ID
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}

	// Sets the Order ID
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}

	// Gets the Order ID Counter
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}

	// Sets the Order ID Counter
	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}

	// Gets the cooking strategy
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	// Sets the cooking strategy
	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	// Gets the cooking price
	public double getCookingPrice() {
		return cookingPrice;
	}

	// Sets the cooking price
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}

	// Method to go through the toppinglist and add the price to the returned value
	protected double addToppingsToPrice(double priceWithoutToppings) {
		totalPrice = priceWithoutToppings;
		for (Toppings toppings : toppingList) {
			if (toppings.equals(Toppings.BELL_PEPPER)) {
				totalPrice += 1.00;
			}
			if (toppings.equals(Toppings.BLACK_OLIVE)) {
				totalPrice += 1.25;
			}
			if (toppings.equals(Toppings.TOMATO)) {
				totalPrice += 1.50;
			}
			if (toppings.equals(Toppings.MUSHROOM)) {
				totalPrice += 1.50;
			}
			if (toppings.equals(Toppings.CHEESE)) {
				totalPrice += 2.00;
			}

			if (toppings.equals(Toppings.PINEAPPLE)) {
				totalPrice += 2.50;
			}
			if (toppings.equals(Toppings.PEPPERONI)) {
				totalPrice += 3.00;
			}
			if (toppings.equals(Toppings.ITALIAN_SAUSAGE)) {
				totalPrice += 3.50;
			}
			if (toppings.equals(Toppings.CANADIAN_BACON)) {
				totalPrice += 4.00;
			}
		}
		return totalPrice;
	}

	// Update price Method to add the toppings to total price
	public double updatePizzaPrice() {
		totalPrice = addToppingsToPrice(priceWithoutToppings);
		return totalPrice;
	}

	// To String Method to display information
	public String toString() {
		return "Price without toppings: $" + priceWithoutToppings + "\nTotal price: $" + totalPrice + "\nToppings: "
				+ toppingList;
	}
}
