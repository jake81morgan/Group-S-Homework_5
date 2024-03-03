package edu.mu.PizzaProject.Enums;

public enum PizzaType {
	HAWAIIAN,
	MARGHERITA,
	SUPREME,
	VEGETARIAN;
	
	private double toppingPrice;
	
	
	// Getters and setters
	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
}
