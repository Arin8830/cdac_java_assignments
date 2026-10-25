package assignment5;

import java.util.Scanner;

public class Patient {
	int patientid;
	String patientname;
	int nfdays;
	double rcharges;
	
	static int patientCount=0;
	static String hospitalName="Max Hospital"; 
	
	Patient(int patientid,String patientname,int nfdays,double rcharges){
		this.patientid=patientid;
		this.patientname=patientname;
		this.nfdays=nfdays;
		this.rcharges=rcharges;
		patientCount++;
	}
	
	double calculateBill() {
		return nfdays * rcharges;
	}
	
	void display() {
        System.out.println("Patient ID: " + patientid);
        System.out.println("Patient Name: " + patientname);
        System.out.println("Days Admitted: " + nfdays);
        System.out.println("Daily Room Charges: Rs. " + rcharges);
        System.out.println("Room Bill: Rs. " + calculateBill());
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("---------------------------");
    }
	
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Patient[] p = new Patient[2];

	        // Take input for 5 patients
	        for (int i = 0; i < 2; i++) {

	            System.out.println("\nEnter details of Patient " + (i + 1));

	            System.out.print("Enter Patient ID: ");
	            int patientid = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Patient Name: ");
	            String patientname = sc.nextLine();

	            System.out.print("Enter Days Admitted: ");
	            int nfdays = sc.nextInt();

	            System.out.print("Enter Daily Room Charges: ");
	            double rcharges = sc.nextDouble();

	            p[i] = new Patient(patientid, patientname, nfdays, rcharges);
	        }

	        // Display all patients
	        System.out.println("\n===== PATIENT DETAILS =====");

	        for (int i = 0; i < 2; i++) {
	            p[i].display();
	        }

	        System.out.println("\nTotal Patients: " + patientCount);

	        sc.close();
	    }
	

}
