package com.oops2;

public class Employee implements Taxable {
	   private int empId;
	    private String name;
	    private double salary;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public double calcTax() {
	        return salary * incomeTax;
	    }

	    public void displayInfo() {
	        System.out.println("Employee Information:");
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	        System.out.println("Income Tax: $" + calcTax());
	    }
}
