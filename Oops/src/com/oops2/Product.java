package com.oops2;

public class Product implements Taxable {
	  private int pid;
	    private double price;
	    private int quantity;

	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    @Override
	    public double calcTax() {
	        return price * quantity * salesTax;
	    }

	    public void displayInfo() {
	        System.out.println("Product Information:");
	        System.out.println("Product ID: " + pid);
	        System.out.println("Price per unit: $" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Sales Tax: $" + calcTax());
	    }
}
