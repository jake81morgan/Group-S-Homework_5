package edu.mu.PizzaProject;

import java.util.ArrayList;
import java.util.List;

import edu.mu.PizzaProject.Enums.CookingStyleType;
import edu.mu.PizzaProject.Enums.Toppings;
import edu.mu.PizzaProject.Pizzas.AbstractPizza;
import edu.mu.PizzaProject.Strategies.BrickOvenCookingStrategy;
import edu.mu.PizzaProject.Strategies.ConventionalOvenCookingStrategy;
import edu.mu.PizzaProject.Strategies.ICookingStrategy;
import edu.mu.PizzaProject.Strategies.MicrowaveCookingStrategy;

public class PizzaOrder {

	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory();
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	/**
	 * TODO:This method gets the pizza order with the given pizza order ID and prints the toppings of that order.
	 * @param orderID
	 */
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		// Iterates through pizza list to find order with that orderID 
		for(AbstractPizza pizza : pizzaOrderList) {
			// Prints Toppings on Pizza
			if(pizza.getPizzaOrderID() == orderID) {
				System.out.println("Toppings List for Order " + orderID + ": ");
				for(Toppings topping: pizza.getToppingList()) {
					System.out.println(topping);
				}
				break;
			}
		}
	}
	
	/**
	 * TODO: This method prints the pizzas in the pizzaOrderList.
	 */
	public void printPizzaOrderCart(int orderID) {
		
		// Prints pizzas if any exist in list
		if(pizzaOrderList != null) {
			System.out.println("Pizzas: ");
			for(AbstractPizza pizza : pizzaOrderList) {
				System.out.println(pizza);
			}
		}
		else {
			System.out.println("No pizzas in list.");
		}
		
	}
	
	/**
	 * TODO: This method finds the pizza order with the given pizza order id and returns it.
	 * @return AbstractPizza : null if NONE exists
	 */
	public AbstractPizza getPizzaByOrderID(int orderID) {
		
		// Searches for pizza in pizza list
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;	
		
	}
	
	/**
	 * TODO: This method finds the pizza order with the given ID
	and adds the given topping to its topping list if it doesn’t already exist in the list. If the given
	topping is added, it also updates the pizza price and returns true. If the topping already exists in
	the topping list of the pizza, it returns false.
	 * @return boolean
	 */
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		
		// Searches pizza list
		for(AbstractPizza pizza : pizzaOrderList) {
			// If pizza with same orderID is found, then topping is added
			if(pizza.getPizzaOrderID() == orderID) {
				List<Toppings> toppings = pizza.getToppingList();
				// If topping is already on pizza then it does not add it again.
				if(toppings.contains(topping)) {
					System.out.println("Topping already on pizza.");
					return false;
				}
				else {
					toppings.add(topping);
					System.out.println("Topping added.");
					return true;	
				}
			}
		}
		return false;
		
	}
	
	/**
	 * TODO: This method finds the pizza order with the given ID and removes the given topping from its topping list if it exists in the list. 
	If the given topping is removed, it also updates the pizza price and returns true. If the topping doesn’t exist in the
	topping list of the pizza and cannot be removed, it returns false.
	 * @return boolean
	 */
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		
		// Searches pizza list
		for(AbstractPizza pizza : pizzaOrderList) {
			// If pizza with same orderID is found, then topping is removed
			if(pizza.getPizzaOrderID() == orderID) {
				List<Toppings> toppings = pizza.getToppingList();
				// Check to make sure topping is on pizza
				if(toppings.contains(topping)) {
					toppings.remove(topping);
					System.out.println("Topping removed.");
					return true;
				}
				else {
					System.out.println("Topping wasn't on thew pizza.");
					return false;	
				}
			}
		}
		return false;
		
	}
	
	/**
	 * TODO: This method checks the pizzas in the pizzaOrderList and checks their cooking strategies. It returns
	true if there are any pizzas without any assigned pizza cooking strategy. It returns false if there
	are no pizzas without an assigned cooking strategy.
	 * @return boolean
	 */
	public boolean isThereAnyUncookedPizza() {
		
		// Searches pizza order list
		for(AbstractPizza pizza : pizzaOrderList) {
			// Returns true if any pizza has no cooking strategy
			if(pizza.getCookingStrategy() == null) {
				System.out.println("There is a pizza without a cooking strategy.");
				return true;
			}
		}
		System.out.println("All pizzas have a cooking strategy.");
		return false;
		
	}
	
	/**
	 * TODO: This method checks if there are any uncooked pizzas. If all pizzas are cooked, it calculates the total
	price of all pizzas and returns the total cart price. However, if there is at least one uncooked pizza
	it throws an exception (Use the general Exception class). The checkout method calls the
	isThereAnyUncookedPizza method to check for uncooked pizzas and throws an exception.
	 * @return double
	 */
	public double checkout() throws Exception {
		
		// Initializes total price of pizzas
		double totalPrice = 0;
		try {
			// Sums all prices of pizzas unless one is not cooked
			for(AbstractPizza pizza : pizzaOrderList) {
				// Throws exception if pizza is not cooked.
				if(pizza.getCookingStrategy() == null) {
					throw new Exception();
				}
				totalPrice = pizza.getTotalPrice();
			}
		}
		catch(Exception e) {
			System.out.println("Not all pizzas are cooked yet.");
			return -1;
		}
		
		return totalPrice;
		
	}
	
	/**
	 * TODO: This method gets the pizza with the given order ID, instantiates the cookingStrategy according to the cookingStrategyType
	parameter. Calls the cook function for the pizza of the pizza order with the given order ID. Returns true if the pizza is found and succesfully cooked.
	 * @return boolean
	 */
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		
		// Sets cooking strategy based on StyleType
		ICookingStrategy strategy = null;
		switch(cookingStrategyType) {
		
			case BRICK_OVEN:
				strategy = new BrickOvenCookingStrategy();
			case CONVENTIONAL_OVEN:
				strategy = new ConventionalOvenCookingStrategy();
			case MICROWAVE:
				strategy = new MicrowaveCookingStrategy();
				default: 
		}
		
		// Searches for pizza with correct orderID
		for(AbstractPizza pizza : pizzaOrderList) {
			// Sets cooking strategy and calls the cook method
			if(pizza.getPizzaOrderID() == orderID) {
				pizza.setCookingStrategy(strategy);
				strategy.cook(pizza);
				System.out.println("Pizza has been cooked using " + cookingStrategyType + ".");
				return true;
				
			}
		}
		
		return false;
		
	}
}
