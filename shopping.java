/* Create classes such as Product, Cart and Order to simulate an online shopping system.
Implement methods to add products to a cart, calculate the total cost and process
payments. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor to initialize Product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method for displaying product information
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

class Cart {
    private List<Product> products;

    // Constructor to initialize Cart
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Add product to the cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate the total cost of products in the cart
    public double getTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    // Display the cart contents
    public void displayCart() {
        System.out.println("\nItems in your Cart:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Empty the cart
    public void clearCart() {
        products.clear();
    }
}

class Order {
    private Cart cart;
    private double totalCost;

    // Constructor to initialize the Order
    public Order(Cart cart) {
        this.cart = cart;
        this.totalCost = cart.getTotalCost();
    }

    // Process payment and finalize the order
    public void processPayment(double paymentAmount) {
        if (paymentAmount >= totalCost) {
            double change = paymentAmount - totalCost;
            System.out.println("\nPayment Successful! Your change is: $" + change);
            cart.clearCart(); // Empty the cart after successful payment
        } else {
            System.out.println("\nInsufficient payment. Please pay the full amount.");
        }
    }

    // Display the order details
    public void displayOrderDetails() {
        System.out.println("\nOrder Summary:");
        cart.displayCart();
        System.out.println("Total Cost: $" + totalCost);
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some sample products
        Product product1 = new Product("Laptop", 799.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 149.99);

        // Create a Cart for the user
        Cart cart = new Cart();

        // Display available products
        System.out.println("Available Products:");
        System.out.println("1. " + product1);
        System.out.println("2. " + product2);
        System.out.println("3. " + product3);

        // Allow user to add products to the cart
        System.out.println("\nEnter the product number to add to the cart (or 0 to finish): ");
        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                cart.addProduct(product1);
                System.out.println("Added " + product1.getName() + " to the cart.");
            } else if (choice == 2) {
                cart.addProduct(product2);
                System.out.println("Added " + product2.getName() + " to the cart.");
            } else if (choice == 3) {
                cart.addProduct(product3);
                System.out.println("Added " + product3.getName() + " to the cart.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\nEnter the product number to add to the cart (or 0 to finish): ");
        }

        // Display the cart and total cost
        cart.displayCart();
        System.out.println("Total Cost: $" + cart.getTotalCost());

        // Proceed to payment
        System.out.print("\nEnter the payment amount: $");
        double paymentAmount = scanner.nextDouble();

        // Create an Order and process the payment
        Order order = new Order(cart);
        order.processPayment(paymentAmount);
        
        scanner.close();
    }
}
