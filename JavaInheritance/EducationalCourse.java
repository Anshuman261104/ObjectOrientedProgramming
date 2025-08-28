
//Sample Problem 2: Educational Course Hierarchy
//Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
//        Tasks:
//Define a superclass Course with attributes like courseName and duration.
//Define OnlineCourse to add attributes such as platform and isRecorded.
//Define PaidOnlineCourse to add fee and discount.
//        Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.

// Base class: Course
class Course {
    String courseName;
    int duration; // in weeks

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse (extends Course)
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // call Course constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding display method
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo(); // show base info
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // call OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding display method
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo(); // show online course info
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

// Main Class
public class EducationalCourse {
    public static void main(String[] args) {
        // Base course
        Course c = new Course("Introduction to Programming", 6);
        c.displayCourseInfo();
        System.out.println("-----------------------");

        // Online course
        OnlineCourse oc = new OnlineCourse("Java Programming", 8, "Coursera", true);
        oc.displayCourseInfo();
        System.out.println("-----------------------");

        // Paid online course
        PaidOnlineCourse poc = new PaidOnlineCourse("Full Stack Development", 12, "Udemy", true, 199.99, 20);
        poc.displayCourseInfo();
    }
}
