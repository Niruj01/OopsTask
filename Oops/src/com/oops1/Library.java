package com.oops1;

public class Library {
	private Book[] books;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added to the library: " + book.getTitle());
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                books[i] = null;
                System.out.println("Book removed from the library.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                System.out.println("Book found in the library:\n" + book);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
