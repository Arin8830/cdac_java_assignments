package filehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Studentread {
	public static void main(String[] args) throws  ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("stu.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student obj;
		
		ArrayList <Student> al = new ArrayList<>();
	
		try {
			
		
    	while((obj = (Student) ois.readObject())!=null) {
    		al.add(obj);
    	}
		}catch(EOFException s) {
			
		}

    	
    	 for(Student s      :al)
         {
         	s.display();
         }
    	 
    	 fis.close();
    	 ois.close();		
		
		
	}

}
