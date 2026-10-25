package assignment5;

import java.util.Scanner;

public class Product {

    int productId;
    String productName;
    double unitPrice;
    int quantityAvailable;

    static int productCount = 0;
    static String storeName = "ABC Store";

    // Parameterized constructor
    Product(int id, String name, double price, int quantity) {
        productId = id;
        productName = name;
        unitPrice = price;
        quantityAvailable = quantity;
        productCount++;
    }

    // Function to calculate stock value
    double calculateStockValue() {
        return unitPrice * quantityAvailable;
    }

    // Function to display product details
    void display() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: Rs. " + unitPrice);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Stock Value: Rs. " + calculateStockValue());
    }

    // Function to display products and calculate inventory
    static void displayProducts(Product[] p) {

        Product highest = p[0];
        double totalInventory = 0;

        for (int i = 0; i < 5; i++) {

            p[i].display();

            totalInventory = totalInventory + p[i].calculateStockValue();

            if (p[i].calculateStockValue() > highest.calculateStockValue()) {
                highest = p[i];
            }
        }

        System.out.println("\n===== PRODUCT WITH HIGHEST STOCK VALUE =====");
        System.out.println("Product ID: " + highest.productId);
        System.out.println("Product Name: " + highest.productName);
        System.out.println("Stock Value: Rs. " + highest.calculateStockValue());

        System.out.println("\nTotal Inventory Value: Rs. " + totalInventory);
        System.out.println("Store Name: " + storeName);
        System.out.println("Total Products: " + productCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] p = new Product[5];

        // Input for 5 products
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Unit Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity Available: ");
            int quantity = sc.nextInt();

            p[i] = new Product(id, name, price, quantity);
        }

        // Call function
        displayProducts(p);

        sc.close();
    }
}
