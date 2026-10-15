
package assignment_2;

import java.util.Scanner;

public class product_discount {

    static double calculateFinalPrice(double price) {
        double discount;

        if (price >= 10000) {
            discount = 20;
        } else if (price >= 5000) {
            discount = 10;
        } else if (price >= 2000) {
            discount = 5;
        } else {
            discount = 0;
        }

        double finalPrice = price - (price * discount / 100);
        return finalPrice;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = s.nextInt();
        s.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = s.nextLine();

        System.out.print("Enter Product Price: ");
        double price = s.nextDouble();

        double finalPrice = calculateFinalPrice(price);

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Final Price: Rs. " + finalPrice);

        s.close();
    }
}
