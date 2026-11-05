package filehandling1;

import java.io.Serializable;

class Book implements Serializable{
	int bid;
	String bname;
	String author;
	float price;
	
	public Book(int bid, String bname, String author, float price) {
		
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	
	void display() {
		System.out.println("bookid"+bid);
		System.out.println("bookname"+bname);
		System.out.println("author"+author);
		System.out.println("price"+price);

		
	}
}


