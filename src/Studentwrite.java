package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Studentwrite {
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		
		FileOutputStream fos =new FileOutputStream("stu.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    
		
		System.out.println("Enter how many students");
		int n= s.nextInt();
		
		for (int i=0;i<n;i++) {
			
			System.out.println("enter the student id");
			int studentid= s.nextInt();
			s.nextLine();
			
			System.out.println("enter the student name");
			String studentname= s.next();
			s.nextLine();
			
			System.out.println("enter the student marks");
			int studentmarks= s.nextInt();
			s.nextLine();
			
			Student s1 = new Student(studentid,studentname,studentmarks);
			oos.writeObject(s1);
			
		}
		
		
        System.out.println("object write is over");

		oos.close();
		fos.close();

		
	}

}
