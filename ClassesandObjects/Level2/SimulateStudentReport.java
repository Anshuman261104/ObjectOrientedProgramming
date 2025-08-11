// Program to Simulate Student Report
//Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
//To calculate the grade based on the marks.
//To display the student's details and grade.


public class SimulateStudentReport {
    // Class to represent a Student
    static class Student {
        // Attributes of the Student class
        String name;
        int rollNumber;
        double marks;

        // Constructor to initialize the attributes
        Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        // Method to calculate the grade based on marks
        String calculateGrade() {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 80) {
                return "B";
            } else if (marks >= 70) {
                return "C";
            } else if (marks >= 60) {
                return "D";
            } else {
                return "F";
            }
        }

        // Method to display the student's details and grade
        void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Student and displaying its details
        Student student = new Student("Alice", 101, 85.5);
        student.displayDetails();
    }
}
