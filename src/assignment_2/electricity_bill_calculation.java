package assignment_2;

import java.util.Scanner;

public class electricity_bill_calculation {
	static double calculateBill(int units) {
		double bill;
		
		  if (units <= 100) {
	            bill = units * 2;
	        } else if (units <= 200) {
	            bill = units * 3;
	        } else if (units <= 300) {
	            bill = units * 5;
	        } else {
	            bill = units * 7;
	        }

	        return bill;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the consumed unit");
		int units= s.nextInt();
		
		double amount = calculateBill(units);

        System.out.println("Electricity Bill: Rs. " + amount);
		
		
		
		
	}

}
