package assignment7;

import java.util.Scanner;

class Billing{
	
	void calculateBill(double price) {
		System.out.println("Single product bill:"+price);
	}
	
	void calculateBill(double price,int quantity) {
		double total=price*quantity;
		System.out.println("Multiple product bill:"+ total);
	}
	
	void calculateBill(double price,int quantity,double discount) {
		double total=price*quantity;
		double finalPrice=total-(total*discount/100);
		System.out.println("Bill After discount:"+ finalPrice);
	}
}

public class Online_shopping_billing_system {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Billing b = new Billing();

	        System.out.print("Enter product price: ");
	        double price = sc.nextDouble();
	        b.calculateBill(price);

	        System.out.print("Enter product price: ");
	        price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();
	        b.calculateBill(price, quantity);

	        System.out.print("Enter product price: ");
	        price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        quantity = sc.nextInt();

	        System.out.print("Enter discount percentage: ");
	        double discount = sc.nextDouble();
	        b.calculateBill(price, quantity, discount);

	        sc.close();
	    }

}
