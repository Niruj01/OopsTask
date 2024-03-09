package com.oops2;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Accept employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Salary: $");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, salary);

        // Accept product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Price per unit: $");
        double pricePerUnit = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(productId, pricePerUnit, quantity);

        // Display tax information
        System.out.println("\nTax Information:");
        employee.displayInfo();
        System.out.println();
        product.displayInfo();

        scanner.close();
    }

	}


