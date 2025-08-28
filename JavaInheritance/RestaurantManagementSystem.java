//Sample Problem 1: Restaurant Management System with Hybrid Inheritance
//Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
//        Tasks:
//Define a superclass Person with attributes like name and id.
//Create an interface Worker with a method performDuties().
//Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
//Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.

// Superclass: Person
// Superclass: RestaurantPerson
class RestaurantPerson {
    String name;
    int id;

    // Constructor
    RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Common method to display basic info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // abstract method
}

// Subclass: Chef (inherits from RestaurantPerson + implements Worker)
class Chef extends RestaurantPerson implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + " dishes.");
    }
}

// Subclass: Waiter (inherits from RestaurantPerson + implements Worker)
class Waiter extends RestaurantPerson implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Rohit", 101, "Italian");
        chef.displayInfo();
        chef.performDuties();
        System.out.println("-----------------------");

        // Create a Waiter
        Waiter waiter = new Waiter("Anshuman", 102, 5);
        waiter.displayInfo();
        waiter.performDuties();
    }
}

