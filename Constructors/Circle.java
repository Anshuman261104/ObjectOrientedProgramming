/*
Question 2:
Write a Circle class with a radius attribute.
Use constructor chaining to initialize radius with default and user-provided values.
*/

class Circle {
    double radius;

    // Default constructor (calls parameterized constructor)
    Circle() {
        this(1.0); // Default radius is 1.0
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void displayCircle() {
        System.out.println("Circle radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();     // Uses default constructor
        Circle c2 = new Circle(5.5);  // Uses parameterized constructor

        c1.displayCircle();
        c2.displayCircle();
    }
}
