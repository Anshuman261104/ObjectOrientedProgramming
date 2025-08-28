//Sample Problem 2: School System with Different Roles
//Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
//Tasks:
//Define a superclass Person with common attributes like name and age.
//Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
//Each subclass should have a method like displayRole() that describes the role.
//Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

// Superclass: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common display method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age); // call Person constructor
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        // Teacher
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        teacher.displayRole();
        System.out.println("-----------------------");

        // Student
        Student student = new Student("Anshuman", 20, "12th Grade");
        student.displayRole();
        System.out.println("-----------------------");

        // Staff
        Staff staff = new Staff("Mrs. Gupta", 35, "Administration");
        staff.displayRole();
    }
}
