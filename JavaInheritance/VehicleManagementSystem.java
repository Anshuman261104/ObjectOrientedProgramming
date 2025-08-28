//Sample Problem 2: Vehicle Management System with Hybrid Inheritance
//Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
//Tasks:
//Define a superclass Vehicle with attributes like maxSpeed and model.
//Create an interface Refuelable with a method refuel().
//Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
//Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.

// Superclass: Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle (inherits Vehicle + implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an Electric Vehicle
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);
        tesla.displayInfo();
        tesla.charge();

        System.out.println("-------------------------");

        // Create a Petrol Vehicle
        PetrolVehicle honda = new PetrolVehicle("Honda City", 180, 40);
        honda.displayInfo();
        honda.refuel();
    }
}
