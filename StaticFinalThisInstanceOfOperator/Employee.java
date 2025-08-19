// Sample Program 3: EmployeeManagementSystem Management System
//Design an EmployeeManagementSystem class with the following features:
//Static:
//○       A static variable companyName shared by all employees.
//○       A static method displayTotalEmployees() to show the total number of employees.
//This:
//○       Use this to initialize name, id, and designation in the constructor.
//Final:
//○       Use a final variable id for the employee ID, which cannot be modified after assignment.
//Instanceof
//○       Check if a given object is an instance of the EmployeeManagementSystem class before printing the employee details.

// EmployeeManagementSystem class
class EmployeeManagementSystem {
    // Static variable (shared by all employees)
    static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Final variable (employee ID cannot be changed once assigned)
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;  // final assignment
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details (with instanceof check)
    public void displayDetails() {
        if (this instanceof EmployeeManagementSystem) {
            System.out.println("Company: " + companyName);
            System.out.println("EmployeeManagementSystem Name: " + this.name);
            System.out.println("EmployeeManagementSystem ID: " + this.id);
            System.out.println("Designation: " + this.designation);
            System.out.println("-----------------------------");
        }
    }
}

// Main class
public class Employee {
    public static void main(String[] args) {
        // Creating EmployeeManagementSystem objects
        EmployeeManagementSystem e1 = new EmployeeManagementSystem("Anshuman Singh", 101, "Software Engineer");
        EmployeeManagementSystem e2 = new EmployeeManagementSystem("Riya Sharma", 102, "HR Manager");
        EmployeeManagementSystem e3 = new EmployeeManagementSystem("Arjun Verma", 103, "Data Analyst");

        // Display details
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // Static method usage
        EmployeeManagementSystem.displayTotalEmployees();
    }
}
