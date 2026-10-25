package assignment6;

import java.util.Scanner;

class Patient{
	int pid;
	String pname;
	float ccharges;
	
	
	Patient(int pid,String pname,float ccharges){
		this.pid=pid;
		this.pname=pname;
		this.ccharges=ccharges;
	}
	
	void display() {
		System.out.println("patient id:"+ pid);
		System.out.println("patient name:"+ pname);
		System.out.println("consultant charges:"+ ccharges);

	}
}

class InPatient extends Patient{
	int nfdays;
	float rcharges;
	float mcharges;
	
	
	InPatient(int nfdays,float rcharges,float mcharges,int pid,String pname,float ccharges){
		
		super(pid,pname, ccharges);
		
		this.nfdays=nfdays;
		this.rcharges=rcharges;
		this.mcharges=mcharges;
	}
	
	double TotalBill() {
		return ccharges + (nfdays * rcharges) + mcharges;
	}
	
	 void displayInPatient() {
	        System.out.println("\n--- InPatient Details ---");
	        display();
	        System.out.println("Admission Days: " + nfdays);
	        System.out.println("Daily Room Charges: " + rcharges);
	        System.out.println("Medicine Charges: " + mcharges);
	        System.out.println("Total Bill: " + TotalBill());
	    }
}

class OutPatient extends Patient {
    double lcharges;
    double pmcharges;

    
   OutPatient(double lcharges, double pmcharges,int pid,String pname,float ccharges) {
   
	   super(pid, pname, ccharges);
       
	   this.lcharges = lcharges;
       this.pmcharges = pmcharges;
    }

    double calculateBill() {
        return ccharges
                + lcharges
                + pmcharges;
    }

    void displayOutPatient() {
    	    System.out.println("\n--- Patient Details---");
    	    display();
    	    
        System.out.println("\n--- OutPatient Details ---");
        
        System.out.println("Laboratory Charges: " + lcharges);
        System.out.println("Prescribed Medicine Charges: "+ pmcharges);
        System.out.println("Total Bill: " + calculateBill());
    }
}


public class Hospital_Billing_System {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("--- Enter InPatient Details ---");

	        System.out.print("Enter Patient ID: ");
	        int id1 = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Patient Name: ");
	        String name1 = sc.nextLine();

	        System.out.print("Enter Consultation Charges: ");
	        float consultation1 = sc.nextFloat();

	        System.out.print("Enter Admission Days: ");
	        int days = sc.nextInt();

	        System.out.print("Enter Daily Room Charges: ");
	        float room = sc.nextFloat();

	        System.out.print("Enter Medicine Charges: ");
	        float medicine1 = sc.nextFloat();

	        InPatient p1 = new InPatient(
	                days, room, medicine1, id1, name1, consultation1);

	        System.out.println("\n--- Enter OutPatient Details ---");

	        System.out.print("Enter Patient ID: ");
	        int id2 = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Patient Name: ");
	        String name2 = sc.nextLine();

	        System.out.print("Enter Consultation Charges: ");
	        float consultation2 = sc.nextFloat();

	        System.out.print("Enter Laboratory Charges: ");
	        double lab = sc.nextDouble();

	        System.out.print("Enter Prescribed Medicine Charges: ");
	        double medicine2 = sc.nextDouble();

	        OutPatient p2 = new OutPatient(lab, medicine2, id2, name2, consultation2);

	        p1.displayInPatient();
	        p2.displayOutPatient();

	        sc.close();
	    }

}
