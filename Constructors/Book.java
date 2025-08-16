/*
Question 1:
Create a Book class with attributes title, author, and price.
Provide both default and parameterized constructors.
*/

class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    // Main method to test
    public static void main(String[] args) {
        Book b1 = new Book();  // Default constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99); // Parameterized

        b1.displayBook();
        b2.displayBook();
    }
}
