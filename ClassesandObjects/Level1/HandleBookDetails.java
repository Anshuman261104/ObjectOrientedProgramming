// Program to Handle Book Details
//Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.

public class HandleBookDetails {
    // Class to represent a Book
    static class Book {
        // Attributes of the Book class
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            // Constructor to initialize the attributes
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayDetails() {
            // Method to display the book details
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Book and displaying its details
        Book book = new Book("The Alchemist", "Paulo Coelho", 350.0);
        book.displayDetails();
    }
}