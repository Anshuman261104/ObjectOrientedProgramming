// Program to Compute Area of a Circle
//Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.

public class AreaOfCircle {
    // Class to represent a Circle
    static class Circle {
        // Attribute to store the radius of the circle
        double radius;

        // Constructor to initialize the radius
        Circle(double radius) {
            this.radius = radius;
        }

        // Method to calculate the area of the circle
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        // Method to calculate the circumference of the circle
        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        // Method to display the area and circumference
        void displayDetails() {
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + calculateArea());
            System.out.println("Circumference: " + calculateCircumference());
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Circle with a specific radius
        Circle circle = new Circle(5.0);

        // Displaying the details of the circle
        circle.displayDetails();
    }
}
