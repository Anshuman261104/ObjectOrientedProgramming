// Program to Simulate a Shopping Cart
//Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
//Add an item to the cart.
//Remove an item from the cart.
//Display the total cost.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SimulateaShoppingCart {
    // Class to represent an item in the shopping cart
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        // Constructor to initialize the attributes
        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate total cost for this item
        double totalCost() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        List<CartItem> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter item name:");
            String itemName = scanner.nextLine();
            System.out.println("Enter item price:");
            double price = scanner.nextDouble();
            System.out.println("Enter item quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Add item to cart
            cart.add(new CartItem(itemName, price, quantity));
            System.out.println("Item added to cart.");

            System.out.println("Do you want to add another item? (yes/no)");
            choice = scanner.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        // Display total cost of items in the cart
        double totalCost = 0.0;
        System.out.println("\nItems in your cart:");
        for (CartItem item : cart) {
            System.out.printf("%s - ₹%.2f x %d = ₹%.2f%n", item.itemName, item.price, item.quantity, item.totalCost());
            totalCost += item.totalCost();
        }

        System.out.printf("Total cost: ₹%.2f%n", totalCost);

        scanner.close();
    }
}
