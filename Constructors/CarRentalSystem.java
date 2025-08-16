/*
Question 6:
Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays.
Add constructors to initialize the rental details and calculate total cost.
*/

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0; // Fixed cost per day

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Basic Car";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental(); // Default
        CarRental r2 = new CarRental("Anshuman", "BMW X5", 5); // Parameterized

        r1.displayRental();
        r2.displayRental();
    }
}

