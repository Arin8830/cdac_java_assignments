package assignment_2;

import java.util.Scanner;


public class student_grade_calculation {
	static char calculategrade(int grade) {
		
		  if (grade >= 90 && grade <= 100) {
	            return 'A';
	        } else if (grade >= 75 && grade <= 89) {
	            return 'B';
	        } else if (grade >= 60 && grade <= 74) {
	            return 'C';
	        } else if (grade >= 50 && grade <= 59) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	}
	
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		
		char result = calculategrade(marks);

        System.out.println("Grade: " + result);
		
		
	}

}
