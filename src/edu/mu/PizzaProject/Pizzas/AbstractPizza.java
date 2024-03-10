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
	public AbstractPizza() {
		
		toppingList = new ArrayList<Toppings>();
		
	}

	// Getters and Setters
	public List<Toppings> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}

	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPizzaOrderID() {
		return pizzaOrderID;
	}

	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}

	public static int getOrderIDCounter() {
		return orderIDCounter;
	}

	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}

	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	protected double addToppingsToPrice(double priceWithoutToppings) {
		totalPrice = priceWithoutToppings;
		for(Toppings toppings : toppingList) {
			if(toppings.equals("BELL_PEPPER")){
				totalPrice += 1.00;
			}
			if(toppings.equals("BLACK_OLIVE")) {
				totalPrice += 1.25;
			}
			if(toppings.equals("TOMATO") || toppings.equals("MUSHROOM")) {
				totalPrice += 1.50;
			}
			if(toppings.equals("MUSHROOM")) {
				totalPrice += 1.50;
			}
			if(toppings.equals("CHEESE")) {
				totalPrice += 2.00;
			}
			if(toppings.equals("PINEAPPLE")) {
				totalPrice += 2.50;
			}
			if(toppings.equals("PEPPERONI")) {
				totalPrice += 3.00;
			}
			if(toppings.equals("ITALIAN_SAUSAGE")) {
				totalPrice += 3.50;
			}
			if(toppings.equals("CANADIAN_BACON")) {
				totalPrice += 4.00;
			}
		}
		return totalPrice;
	}
	
	
	
}
