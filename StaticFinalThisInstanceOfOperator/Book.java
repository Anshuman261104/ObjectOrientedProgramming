// Sample Program 2: Library Management System
//Create a Book class to manage library books with the following features:
//Static:
//○       A static variable libraryName shared across all books.
//○       A static method displayLibraryName() to print the library name.
//This:
//○       Use this to initialize title, author, and isbn in the constructor.
//Final:
//○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
//Instanceof:
//○       Verify if an object is an instance of the Book class before displaying its details.

class BookManagementSystem {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;

    public BookManagementSystem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof BookManagementSystem) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("ISBN: " + this.isbn);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid Book object.");
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
}

public class Book {
    public static void main(String[] args) {
        BookManagementSystem b1 = new BookManagementSystem("ISBN101", "The Alchemist", "Paulo Coelho");
        BookManagementSystem b2 = new BookManagementSystem("ISBN102", "Wings of Fire", "A.P.J. Abdul Kalam");

        b1.displayBookDetails();
        b2.displayBookDetails();

        BookManagementSystem.displayLibraryName();
    }
}
