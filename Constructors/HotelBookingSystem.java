/*
Question 4:
Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights.
Use default, parameterized, and copy constructors to initialize bookings.
*/

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        guestName = other.guestName;
        roomType = other.roomType;
        nights = other.nights;
    }

    void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking(); // Default
        HotelBooking b2 = new HotelBooking("Rahul", "Deluxe", 3); // Parameterized
        HotelBooking b3 = new HotelBooking(b2); // Copy

        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}
