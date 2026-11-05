package filehandling;

import java.io.Serializable;

public class Student implements Serializable{
	int sid;
	String name;
	int marks;
	
	public Student(int sid, String name, int marks) {
		
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	void display() {
		System.out.println("Studentid:" + sid);
		System.out.println("Studentname:" + name);
		System.out.println("Studentmarks:" + marks);

	}
}
