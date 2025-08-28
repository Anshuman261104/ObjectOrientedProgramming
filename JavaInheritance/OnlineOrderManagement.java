// Sample Problem 1: Online Retail Order Management
//Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
//Tasks:
//Define a base class Order with common attributes like orderId and orderDate.
//Create a subclass ShippedOrder with additional attributes like trackingNumber.
//Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
//Implement a method getOrderStatus() to return the current order status based on the class level.
//Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

// Base class: Order
class Order {
    String orderId;
    String orderDate;

    // Constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder (extends Order)
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // call Order constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus
    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // call ShippedOrder constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main Class
public class OnlineOrderManagement {
    public static void main(String[] args) {
        // Stage 1: Order placed
        Order order = new Order("ORD001", "2025-08-28");
        System.out.println(order.getOrderStatus());

        // Stage 2: Order shipped
        ShippedOrder shipped = new ShippedOrder("ORD001", "2025-08-28", "TRK789123");
        System.out.println(shipped.getOrderStatus());

        // Stage 3: Order delivered
        DeliveredOrder delivered = new DeliveredOrder("ORD001", "2025-08-28", "TRK789123", "2025-09-02");
        System.out.println(delivered.getOrderStatus());
    }
}

