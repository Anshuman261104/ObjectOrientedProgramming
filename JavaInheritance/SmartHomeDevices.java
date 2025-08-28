
//Sample Problem 2: Smart Home Devices
//Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
//Tasks:
//Define a superclass Device with attributes like deviceId and status.
//Create a subclass Thermostat with additional attributes like temperatureSetting.
//Implement a method displayStatus() to show each device's current settings.
//Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

// Superclass: Device
class Device {
    String deviceId;
    String status; // e.g., "ON" or "OFF"

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat (extends Device)
class Thermostat extends Device {
    int temperatureSetting; // in Celsius

    // Constructor
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() to include thermostat details
    @Override
    void displayStatus() {
        super.displayStatus(); // show device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("TH123", "ON", 24);

        // Display its status
        thermostat.displayStatus();
    }
}
