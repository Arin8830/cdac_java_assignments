package all_practice;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	int bid;
	String title;
	String author;
	int price;
	
	
	public Book(int bid, String title, String author, int price) {
		
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Book id"+bid);
		System.out.println("Book title"+title);
		System.out.println("Book author"+author);
		System.out.println("Book price"+price);

	}
	
}
public class arraylist {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> al= new ArrayList<>();
		
		
		while(true) {
			System.out.println("=======Book Management System=========");
		    System.out.println("1:Add Book");
		    System.out.println("2:Display Book");
		    System.out.println("3:Search Book");
		    System.out.println("4:Update Book");
		    System.out.println("5:Delte Book");
		    System.out.println("6:Total Book");
		    System.out.println("7:Exit");
		    
		    
		    System.out.println("Enter choice");
		    int choice=sc.nextInt();
		    
		    switch(choice) {
		    
		    case 1:
		    	//Add book
		    	
		    	System.out.println("Enter how many books you add");
		    	int n= sc.nextInt();
		    	
		    	for(int i=0;i<n;i++) {
		    		System.out.println("Enter the book id");
			    	int bid=sc.nextInt();
			    	
			    	System.out.println("Enter book title");
			    	String btitle=sc.next();
			    	
			    	System.out.println("Enter book author");
			    	String bauthor=sc.next();
			    	
			    	System.out.println("Enter the book price");
			    	int bprice=sc.nextInt();
			    	
			    	Book b = new Book(bid,btitle,bauthor,bprice);
			    	
			    	al.add(b);
			    	System.out.println("Book added sucessfully");
			    	
		    	}
		    	break;
		    	
		    case 2:
		    	//Display Book
		    	for(Book b:al) {
		    		b.display();
		    		System.out.println("Book Added successfully");
		    		
		    	}
		    	break;
		    	
		    case 3:
		    	//Search book
		    	
		    	System.out.println("Enter the id for searching");
		    	int searchid=sc.nextInt();
		    	int flag=0;
		    	
		    	for(Book b:al) {
		    		if(b.bid==searchid) {
		    			b.display();
		    			System.out.println("Book found successsfully");
		    			flag=1;
		    		}
		    		if(flag==0) {
		    			System.out.println("Book not found");
		    		}
		    	}
		    	break;
		    	
		    case 4:
		    	//Update book
		    	System.out.println("Enter id for updating");
		    	int updateid=sc.nextInt();
		    	flag=0;
		    	for(Book b:al) {
		    		if(b.bid==updateid) {
		    			
		    			System.out.println("Enter the new price");
		    			b.price=sc.nextInt();
		    			
		    			System.out.println("Book update successfully");
		    			flag=1;
		    			
		    		}
		    		if(flag==0) {
		    			System.out.println("Book not found!");
		    		}
		    	}
		    	break;
		    	
		    case 5:
		    	//Delete book
		    	System.out.println("Enter id for deleting");
		    	int deleteid=sc.nextInt();
		    	flag=0;
		    	
		    	for(Book b:al) {
		    		if(b.bid==deleteid) {
		    			al.remove(b);
		    			System.out.println("Book deleted suceessfully");
		    			flag=1;
		    		}
		    		if (flag==0) {
		    			System.out.println("Book not found!");
		    		}
		    	}
		    	break;
		    	
		    case 6:
		    	//total book
		    	
		    	System.out.println("Total book"+al.size());
		    	break;
		    	
		    	
		    case 7:
		    	System.out.println("Exiting!!!!");
		    	sc.close();
		    	return;
		    	
		    	default:
		    		System.out.println("Invalid choice");
		    	}
		    
		    
		    }


		    

		}
	}


