package assignment5;

import java.util.Scanner;

public class ElectricityBill {
	int cnumber;
	String cname;
	double units;
	double cost;
	
	static int consumerCount=0;
	static String electricityBoard ="Maharashtra Electricity Board";
	
	ElectricityBill(int cnumber,String cname,double units,double cost){
		this.cnumber=cnumber;
		this.cname=cname;
		this.units=units;
		this.cost=cost;
		consumerCount++;
		
		
	}
	
	 double calculateBill() {
	        return units * cost;
	    }
	 
	    void display() {
	        System.out.println("\nConsumer Number: " + cnumber);
	        System.out.println("Consumer Name: " + cname);
	        System.out.println("Units Consumed: " + units);
	        System.out.println("Cost Per Unit: Rs. " + cost);
	        System.out.println("Electricity Bill: Rs. " + calculateBill());
	        System.out.println("Electricity Board: " + electricityBoard);
	    }
	    
	    static void displayConsumers(ElectricityBill[] e) {

	        for (int i = 0; i < 2; i++) {
	            e[i].display();
	        }

	        System.out.println("\nTotal Consumers: " + consumerCount);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ElectricityBill[] e = new ElectricityBill[5];

	        // Input for 5 consumers
	        for (int i = 0; i < 2; i++) {

	            System.out.println("\nEnter details of Consumer " + (i + 1));

	            System.out.print("Enter Consumer Number: ");
	            int number = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Consumer Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Units Consumed: ");
	            double units = sc.nextDouble();

	            System.out.print("Enter Cost Per Unit: ");
	            double cost = sc.nextDouble();

	            e[i] = new ElectricityBill(number, name, units, cost);
	        }

	        // Display all consumer details and bills
	        System.out.println("\n===== ELECTRICITY BILL DETAILS =====");
	        displayConsumers(e);

	        sc.close();
	    }
	

}
