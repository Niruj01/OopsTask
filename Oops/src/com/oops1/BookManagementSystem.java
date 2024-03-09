package com.oops1;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Create a library with a capacity of 5 books
        Library library = new Library(5);

        // Demonstrate adding books to the library
        library.addBook(new Book(101, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(102, "Rich Dad Poor Dad", " Robert Kiyosaki and Sharon Lechter"));
        library.addBook(new Book(103, "1984", "George Orwell"));
        library.addBook(new Book(104, "Think and Grow Rich", "Napoleon Hill"));

        // Display books in the library
        library.displayBooks();

        // Demonstrate searching for a book by ID
        System.out.println("Enter book ID to search:");
        int searchID = scanner.nextInt();
        library.searchBook(searchID);

        // Demonstrate removing a book from the library
        System.out.println("Enter book ID to remove:");
        int removeID = scanner.nextInt();
        library.removeBook(removeID);

        // Display updated list of books in the library
        library.displayBooks();

        scanner.close();

	}

}
