package practice_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Employee{
	int employeeid;
	String employeename;
	String department;
	int salary;
	
	public Employee(int employeeid, String employeename, String department, int salary) {
		
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.department = department;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Enter the employee id:"+employeeid);
		System.out.println("Enter the employee name:"+employeename);
		System.out.println("Enter the employee department:"+department);
		System.out.println("Enter the employee salary:"+salary);
		System.out.println("=================================================");

		
	}
	
}

public class hashmap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Employee> hm= new HashMap<>();
		
		while(true) {
			
			System.out.println("================Employee Record management=================");
			System.out.println("0:Add employee");
			System.out.println("1:Display employee");
			System.out.println("2:Search employee");
			System.out.println("3:Update employee");
			System.out.println("4:Delete employee");
			System.out.println("5: Employee Exist");
			System.out.println("6:Total employee");
			System.out.println("=================================================");

			
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 0:
				//Add employee
				
				System.out.println("Enter the id of employee:");
				int id =sc.nextInt();
				
				System.out.println("Enter the name of employee:");
				String name =sc.next();
				
				System.out.println("Enter the department name of employee:");
				String department =sc.next();
				
				System.out.println("Enter the salary of employee:");
				int salary =sc.nextInt();
				
				Employee e = new Employee(id,name,department,salary);
				
				hm.put(id, e);
	            break;
	            
	            
			case 1:
				//Display Employee
				for(Map.Entry<Integer, Employee> e1 :hm.entrySet())
				{
					e1.getValue().display();
				}
                 		break;
			case 2:
				//Search Employee
				System.out.println("Enter the search id for searching");
				int searchid=sc.nextInt();
				
				if(hm.containsKey(searchid)) {
					hm.get(searchid).display();
					System.out.println("Employee found successfully");
					
				}else {
					System.out.println("Employee not found!");
				}
				break;
				
			case 3:
				//Update Employee
				System.out.println("Enter the employee id for update");
				int updateid= sc.nextInt();
				
				if(hm.containsKey(updateid)) {
					
					System.out.println("Enter the new salary");
					int salary1=sc.nextInt();
					
					Employee e1 =hm.get(updateid);
					e1.salary=salary1;
					
				}else {
            		System.out.println("Employee not found!");
            	}
             break;
             
			case 4:
				//Delete Employee
				System.out.println("Enter if for delete:");
				int deleteid= sc.nextInt();
				
				if(hm.containsKey(deleteid)) {
					hm.remove(deleteid);
					System.out.println("Employee deleted successfully");
					
				}else {
					System.out.println("Employee not found!");
				}
				break;
				
			case 5:
				//Check Employee Exist
				System.out.println("Enter the id for checking");
				int checkid=sc.nextInt();
				
				 if(hm.containsKey(checkid))
                 {
                     System.out.println("Employee Exists!");
                 }
                 else
                 {
                     System.out.println("Employee Not Found!");
                 }
                 break;
             	
             case 6:
                 // Total Employees
                 System.out.println("Total Employees: " + hm.size());
                 break;

             case 7:
                 System.out.println("Exiting Employee Management System...");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid Choice!");
             	
				
			}
			
		}
	}

}
