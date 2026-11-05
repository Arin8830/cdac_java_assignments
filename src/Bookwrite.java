package filehandling1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bookwrite {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream  fos = new FileOutputStream("book.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter how many boooks");
		int n= s.nextInt();
		s.nextLine();
		
		for (int i=0;i<n;i++) {
			
			System.out.println("Enter bookid");
			int bookid= s.nextInt();
			s.nextLine();
			
			System.out.println("Enter bookname");

			String bookname= s.next();
			
			System.out.println("Enter bookauthor");

			
			String bookauthor= s.next();
			
			System.out.println("Enter bookprice");

			float bookprice= s.nextFloat();
			s.nextLine();
			
			Book b = new Book (bookid,bookname,bookauthor,bookprice);
			
			oos.writeObject(b);
		}
		
		fos.close();
		oos.close();
		
		}

}
