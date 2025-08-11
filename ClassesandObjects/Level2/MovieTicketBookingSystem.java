// Program to Model a Movie Ticket Booking System
//Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
//Book a ticket (assign seat and update price).
//Display ticket details.


public class MovieTicketBookingSystem {
    // Class to represent a Movie Ticket
    static class MovieTicket {
        // Attributes of the MovieTicket class
        String movieName;
        String seatNumber;
        double price;

        // Constructor to initialize the attributes
        MovieTicket(String movieName, String seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }

        // Method to book a ticket (assign seat and update price)
        void bookTicket(String newSeatNumber, double newPrice) {
            this.seatNumber = newSeatNumber;
            this.price = newPrice;
            System.out.println("Ticket booked successfully!");
        }

        // Method to display ticket details
        void displayTicketDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of MovieTicket
        MovieTicket ticket = new MovieTicket("Inception", "A1", 300.0);

        // Displaying initial ticket details
        ticket.displayTicketDetails();

        // Booking a new ticket with updated seat and price
        ticket.bookTicket("B2", 350.0);

        // Displaying updated ticket details
        ticket.displayTicketDetails();
    }
}
