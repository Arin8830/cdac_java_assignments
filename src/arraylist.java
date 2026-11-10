package practice_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	int bookid;
	String title;
	String author;
	int price;
	
	public Book(int bookid, String title, String author, int price) {
		
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	void display() {
		System.out.println("book id:"+bookid);
		System.out.println("book title:"+title);
		System.out.println("book author:"+author);
		System.out.println("book price:"+price);
		System.out.println("=================================================");

	}
	
}
public class arraylist {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> al = new ArrayList<>();
		
		while(true) {
			System.out.println("========================Books Inventory Management=========================");

			System.out.println("0:Add books");
			System.out.println("1:Display books");
			System.out.println("2:Search books");
			System.out.println("3:Update books");
			System.out.println("4:Delete books");
			System.out.println("5:Total books");
			System.out.println("6:Exit");
			System.out.println("=================================================");

			
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 0:
				//Add book
				
				System.out.println("Enter how many books you have to add:");
				int n = sc.nextInt();
				
				for (int i=0;i<n;i++) {
					
					System.out.println("Enter the id of book");
					int id=sc.nextInt();
					
					System.out.println("Enter the title of book");
					String title=sc.next();
					
					System.out.println("Enter the author of book");
					String author=sc.next();
					
					System.out.println("Enter the price of book");
					int price=sc.nextInt();
					
					Book b = new Book(id,title,author,price);
					
					al.add(b);
										
					
				}
				
				break;
				
			case 1:
				//Display books
				for(Book b: al) {
					b.display();
				}
				break;
				
			case 2:
				//Search book
				System.out.println("Enter the id for searching");
				int searchid= sc.nextInt();
				
				
				for(Book b: al) {
					if(b.bookid==searchid) {
						b.display();
						
						System.out.println("Book found successfully");
					}else {
						System.out.println("Book not found");
					  
					}
				}
				break;
				
			case 3:
				//Update book
				System.out.println("Enter the id for searching");
				int updateid= sc.nextInt();
				
				
				for(Book b: al) {
					if(b.bookid==updateid) {
						 
						System.out.println("Enter the new price");
						b.price= sc.nextInt();
						
						
						System.out.println("Book updated successfully");
					}else {
						System.out.println("Book not found");
					  
					}
				}
				break;
				
			case 4:
				//Delete book
				System.out.println("Enter the id for delete");
				int deleteid= sc.nextInt();
				
				
				for(Book b: al) {
					if(b.bookid==deleteid) {			
						al.remove(b);
						System.out.println("Book deleted successfully");
					}else {
						System.out.println("Book not found");
					  
					}
				}
				break;
				
			case 5:
				//total books
				System.out.println("Total books:"+ al.size());
				break;
				
			case 6:
				System.out.println("Exiting book inventory");
				return;
				
				default:
        			System.out.println("Invalid choice!");

			}

		}
	}

}
