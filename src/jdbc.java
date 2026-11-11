package practice_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc= new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc", "root", "root");
        
        
        while(true) {
        	
        	 System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
             System.out.println("1. Insert Book");
             System.out.println("2. Display Books");
             System.out.println("3. Update Book");
             System.out.println("4. Delete Book");
             System.out.println("5. Exit");
             
             System.out.println("Enter the choice");
             int choice=sc.nextInt();
             
             switch(choice) {
             
             case 1:
//            	 1\. Insert Book
//
//            	 - Accept book details from the user.
//            	 - Create a Book object.
//            	 - Insert the book details into the database using PreparedStatement.
//            	 - Display an appropriate success message.
//            	 
            	 
            	 System.out.print("Enter Book ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Book Name: ");
                 String name = sc.nextLine();

                 System.out.print("Enter Author: ");
                 String author = sc.nextLine();

                 System.out.print("Enter Price: ");
                 double price = sc.nextDouble();

                 System.out.print("Enter Quantity: ");
                 int quantity = sc.nextInt();
                 
                 String q1= "INSERT INTO BOOK VALUES (?,?,?,?,?)";
                 PreparedStatement ps1= con.prepareStatement(q1);
                 
                 ps1.setInt(1, id);
                 ps1.setString(2,name);
                 ps1.setString(3,author);
                 ps1.setDouble(4,price);
                 ps1.setInt(5,quantity);
                 
                 ps1.executeUpdate();
                 
                 System.out.println("Book inserted Successfully");
                 ps1.close();
                 break;
                 
             case 2:
            	 //Display
            	 

            	 
             }
             

        }
	}

}
