package all_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	String department;
	int salary;
	
	public Employee(int eid, String ename, String department, int salary) {
	
		this.eid = eid;
		this.ename = ename;
		this.department = department;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("==========+-==Emplyee Management System==========");
		System.out.println("Employee id"+ eid);
		System.out.println("Employee name"+ ename);
		System.out.println("Employee department"+ department);
		System.out.println("Employee salary"+ salary);



	}
	
}
public class hashmap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Employee>hm = new HashMap<>();
		
		while(true) {
			System.out.println("Employee Record Management");
			System.out.println("1:Add Employee");
			System.out.println("2:Display Employee");
			System.out.println("3:Search Employee");
			System.out.println("4:Update Employee");
			System.out.println("5:Delete Employee");
			System.out.println("6:Check Employee");
			System.out.println("7:Total Employee");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				//Add employee
				System.out.println("Enter employee id");
				int eid=sc.nextInt();
				
				System.out.println("Enter employee name");
				String ename=sc.next();
				
				System.out.println("Enter employee department");
				String department=sc.next();
				
				System.out.println("Enter employee salry");
				int salary=sc.nextInt();
				
				Employee e= new Employee(eid,ename,department,salary);
				
				hm.put(eid, e);
				System.out.println("Employee added successfully");
				
				break;
				
			case 2:
				//display employee
				for(Map.Entry<Integer,Employee> e1:hm.entrySet()) {
					e1.getValue().display();
				}
				break;
				
			case 3:
				//Search employee
				System.out.println("Enter id for searching");
				int searchid=sc.nextInt();
				
				if(hm.containsKey(searchid)) {
					hm.get(searchid);
					System.out.println("Employee found successfully");
				}else {
					System.out.println("Employee not found!");
					
				}
				break;
				
			case 4:
				//Update employee
				System.out.println("Enter the id for updating");
				int updateid=sc.nextInt();
				
				if(hm.containsKey(updateid)) {
					
					System.out.println("Enter the new salary");
					int newsalary=sc.nextInt();
					
					Employee e1= hm.get(updateid);
					e1.salary=newsalary;
					
					System.out.println("Employee salary updated successfully");

				}
				break;
				
			case 5:
				//Delete Employee
				System.out.println("Enter id for deleting");
				int deleteid=sc.nextInt();
				
				if(hm.containsKey(deleteid)) {
					hm.remove(deleteid);
					System.out.println("Employee deleted successfully");
				}else {
					System.out.println("Employee not found!");
					
				}
				break;
				
			case 6:
				//Check employee
				System.out.println("Enter id for checking");
				int checkid=sc.nextInt();
				
				if(hm.containsKey(checkid)) {
					System.out.println("Employee Exist");
				}else {
					System.out.println("Employee not found!");
				}
			break;
			
			case 7:
				//Total 
				
				System.out.println("Total Employee"+ hm.size());
				break;
				
				default:
					System.out.println("Invalid choice");
			}
			
			
		}
	}

}
