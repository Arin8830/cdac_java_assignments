package assignment7;

import java.util.Scanner;

class Doctor{
	int doctorid;
	String doctorname;
	String specialization;
	
	 Doctor(int doctorid,String doctorname,String specialization) {
		this.doctorid=doctorid;
		this.doctorname=doctorname;
		this.specialization=specialization;
		
	}
	 
	 void displayDoctor() {
	        System.out.println("Doctor ID: " + doctorid);
	        System.out.println("Doctor Name: " + doctorname);
	        System.out.println("Specialization: " + specialization);
	    }
	
	
}

class Patient{
	int patientid;
	String patientname;
	Doctor doctor;
	
	
	 Patient(int patientid,String patientname,Doctor doctor) {
			this.patientid=patientid;
			this.patientname=patientname;
			this.doctor=doctor;
		}
	 
	  void displayPatient() {
	        System.out.println("Patient ID: " + patientid);
	        System.out.println("Patient Name: " + patientname);
	        System.out.println("Assigned Doctor Details:");
	        doctor.displayDoctor();
	        System.out.println("----------------------");
	    }
}

public class Hospital_Management_System {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Doctor 1 Details:");
        System.out.print("Doctor ID: ");
        int d1Id = sc.nextInt();
        sc.nextLine();

        System.out.print("Doctor Name: ");
        String d1Name = sc.nextLine();

        System.out.print("Specialization: ");
        String d1Spec = sc.nextLine();

        Doctor d1 = new Doctor(d1Id, d1Name, d1Spec);

        System.out.println("\nEnter Patient 1 Details:");
        System.out.print("Patient ID: ");
        int p1Id = sc.nextInt();
        sc.nextLine();

        System.out.print("Patient Name: ");
        String p1Name = sc.nextLine();

        Patient p1 = new Patient(p1Id, p1Name, d1);

        System.out.println("\nEnter Patient 2 Details:");
        System.out.print("Patient ID: ");
        int p2Id = sc.nextInt();
        sc.nextLine();

        System.out.print("Patient Name: ");
        String p2Name = sc.nextLine();

        Patient p2 = new Patient(p2Id, p2Name, d1);

        System.out.println("\n===== HOSPITAL DETAILS =====");
        p1.displayPatient();
        p2.displayPatient();

        sc.close();
    }

}
