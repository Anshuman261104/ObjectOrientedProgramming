// Program to Display Employee Details
//Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class EmployeeDetails {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }

    // Main method to test the EmployeeDetails class
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails("John Doe", 101, 75000.00);
        employee.displayDetails();
    }
}