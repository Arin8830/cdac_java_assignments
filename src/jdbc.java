package all_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		Scanner sc  = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc", "root", "root");
        
        while(true) {
        	
        	System.out.println("====Book Management======");
        	System.out.println("1:Insert Book");
        	System.out.println("2:Display Book");
        	System.out.println("3:Update Book");
        	System.out.println("4:Delete Book");
        	System.out.println("5:Exiting Book!!!!!!!!");
        	System.out.println("=======================================");
        	
        	System.out.println("Enter choice");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	
        	case 1:
        		//Insert book
        		
        		System.out.println("Enter book id");
        		int book_id=sc.nextInt();
        		
        		System.out.println("Enter book name");
        		String book_name=sc.next();
        		
        		System.out.println("Enter author name");
        		String author=sc.next();
        		
        		System.out.println("Enter book price");
        		int price=sc.nextInt();
        		
        		System.out.println("Enter book quantity");
        		int quantity=sc.nextInt();
        		
        		String q1="INSERT INTO Book VALUES (?,?,?,?,?)";
        		PreparedStatement ps1= con.prepareStatement(q1);
        		
        		ps1.setInt(1, book_id);
        		ps1.setString(2,book_name);
        		ps1.setString(3, author);
        		ps1.setInt(4, price);
        		ps1.setInt(5, quantity);
        		
        		ps1.executeUpdate();
        		
        		System.out.println("Book Added successfully");
        		break;
        		
        	case 2:
        		//Display book
        		
        		System.out.println("============Book Details==========");
        		
        		String q2= "SELECT * FROM Book";
        		PreparedStatement ps2= con.prepareStatement(q2);
        		
        		ResultSet rs= ps2.executeQuery();
        		
        		while(rs.next()) {
        			System.out.println(
        					rs.getInt(1)+ "" +
        					rs.getString(2)+ "" +
        					rs.getString(3)+ "" +
        					rs.getInt(4)+ "" +
        					rs.getInt(5)+ "" 
        					);
        		}
        		
        		break;
        		
        	case 3:
        		//Update Query
        		
        		System.out.println("Enter book id");
        		int newbid=sc.nextInt();
        		
        		System.out.println("Enter book name");
        		String newbname=sc.next();
        		
        		System.out.println("Enter book author name");
        		String newbauthor=sc.next();
        		
        		System.out.println("Enter book price");
        		int newbprice=sc.nextInt();
        		
        		System.out.println("Enter book quantity");
        		int newbquantity=sc.nextInt();
        		
        		String q3="UPDATE Book SET book_name=?,author=?,price=?,quantity=? where book_id=?";
        		PreparedStatement ps3 = con.prepareStatement(q3);
        		
        		ps3.setString(1, newbname);
        		ps3.setString(2, newbauthor);
        		ps3.setInt(3, newbprice);
        		ps3.setInt(4, newbquantity);
        		ps3.setInt(5, newbid);
        		
        		
        		ps3.executeUpdate();
        		System.out.println("Book Updated Successfully");
        		break;
        		
        	case 4:
        		//Delete book
        		
        		System.out.println("Enter id for deleting");
        		int bid=sc.nextInt();
        		

        		String q4="Delete From Book where book_id=?";
        		PreparedStatement ps4 = con.prepareStatement(q4);
        		
        		ps4.setInt(1, bid);
        		
        		ps4.executeUpdate();
        		
        		break;

        	case 5:
        		System.out.println("Exiting!!!!");
        		sc.close();
        		return;
        		
        		default:
        			System.out.println("Invalid choice");
        		
        		
        	
        	}


        }
	}

}