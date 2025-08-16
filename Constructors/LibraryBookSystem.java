/*
Question 5:
Library Book System: Create a Book class with attributes title, author, price, and availability.
Implement a method to borrow a book.
*/

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String t, String a, double p, boolean avail) {
        title = t;
        author = a;
        price = p;
        available = avail;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed successfully!");
        } else {
            System.out.println(title + " is not available right now.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Clean Code", "Robert C. Martin", 399.99, true);

        b1.displayBook();
        b1.borrowBook(); // Borrowing
        b1.displayBook();
        b1.borrowBook(); // Try again
    }
}
