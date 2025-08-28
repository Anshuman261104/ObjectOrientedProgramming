// Sample Problem 1: Library Management with Books and Authors
//Description: Model a Book system where Book is the superclass, and Author is a subclass.
//Tasks:
//Define a superclass Book with attributes like title and publicationYear.
//Define a subclass Author with additional attributes like name and bio.
//Create a method displayInfo() to show details of the book and its author.
//Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.

// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extends Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() to include author details
    @Override
    void displayInfo() {
        super.displayInfo(); // display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object (also represents a book)
        Author bookWithAuthor = new Author(
                "The Great Adventure",
                2023,
                "John Smith",
                "John Smith is a novelist known for adventure stories."
        );

        // Display all information
        bookWithAuthor.displayInfo();
    }
}
