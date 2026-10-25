package assignment5;

import java.util.Scanner;

public class Book {
	int bookid;
	String booktitle;
	String authorname;
	double price;
	
	static int bookCount =0;
	static String storeName="Vijay Book Depo";
	
	Book(int bookid,String booktitle,String authorname,double price){
		this.bookid=bookid;
		this.booktitle=booktitle;
		this.authorname=authorname;
		this.price=price;
		bookCount++;
		
	}
	
	  void display() {
	        System.out.println("\nBook ID: " + bookid);
	        System.out.println("Book Title: " + booktitle);
	        System.out.println("Author Name: " + authorname);
	        System.out.println("Price: Rs. " + price);
	        System.out.println("Store Name: " + storeName);
	    }
	  
	    // Function to display books and find highest price
	    static void displayBooks(Book[] b) {

	        Book highest = b[0];

	        System.out.println("\n===== BOOK DETAILS =====");

	        for (int i = 0; i < 2; i++) {

	            b[i].display();

	            if (b[i].price > highest.price) {
	                highest = b[i];
	            }
	        }

	        System.out.println("\n===== MOST EXPENSIVE BOOK =====");
	        System.out.println("Book ID: " + highest.bookid);
	        System.out.println("Book Title: " + highest.booktitle);
	        System.out.println("Author Name: " + highest.authorname);
	        System.out.println("Price: Rs. " + highest.price);

	        System.out.println("\nStore Name: " + storeName);
	        System.out.println("Total Books Created: " + bookCount);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Book[] b = new Book[2];

	        // Input for 5 books
	        for (int i = 0; i < 2; i++) {

	            System.out.println("\nEnter details of Book " + (i + 1));

	            System.out.print("Enter Book ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Book Title: ");
	            String title = sc.nextLine();

	            System.out.print("Enter Author Name: ");
	            String author = sc.nextLine();

	            System.out.print("Enter Price: ");
	            double price = sc.nextDouble();

	            b[i] = new Book(id, title, author, price);
	        }

	        // Call the function
	        displayBooks(b);

	        sc.close();
	    }

	
	
	

}
