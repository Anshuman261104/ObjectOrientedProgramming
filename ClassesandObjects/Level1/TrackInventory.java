// Program to Track Inventory of Items
//Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.

public class TrackInventory {
    // Class to represent an Item
    static class Item {
        // Attributes of the Item class
        String itemCode;
        String itemName;
        double price;

        // Constructor to initialize the attributes
        Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        // Method to display item details and calculate total cost
        void displayDetails(int quantity) {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Unit: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + (price * quantity));
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Item and displaying its details
        Item item = new Item("I123", "Pen", 10.0);
        item.displayDetails(5);
    }
}
