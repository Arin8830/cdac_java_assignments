
package all_practice;

class Patient {
    int patientId;
    String patientName;
    double consultationCharges;

    // Base class constructor
    Patient(int patientId, String patientName, double consultationCharges) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.consultationCharges = consultationCharges;
    }

    // Display common details
    void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Consultation Charges: " + consultationCharges);
    }
}

// First derived class
class InPatient extends Patient {
    int admissionDays;
    double dailyRoomCharges;
    double medicineCharges;

    InPatient(int patientId, String patientName, double consultationCharges,
              int admissionDays, double dailyRoomCharges, double medicineCharges) {

        super(patientId, patientName, consultationCharges);

        this.admissionDays = admissionDays;
        this.dailyRoomCharges = dailyRoomCharges;
        this.medicineCharges = medicineCharges;
    }

    void calculateBill() {
        double totalBill = consultationCharges +
                           (admissionDays * dailyRoomCharges) +
                           medicineCharges;

        System.out.println("\n--- INPATIENT BILL ---");
        displayDetails();
        System.out.println("Admission Days: " + admissionDays);
        System.out.println("Daily Room Charges: " + dailyRoomCharges);
        System.out.println("Medicine Charges: " + medicineCharges);
        System.out.println("Total Bill: " + totalBill);
    }
}

// Second derived class
class OutPatient extends Patient {
    double laboratoryCharges;
    double prescribedMedicineCharges;

    OutPatient(int patientId, String patientName, double consultationCharges,
               double laboratoryCharges, double prescribedMedicineCharges) {

        super(patientId, patientName, consultationCharges);

        this.laboratoryCharges = laboratoryCharges;
        this.prescribedMedicineCharges = prescribedMedicineCharges;
    }

    void calculateBill() {
        double totalBill = consultationCharges +
                           laboratoryCharges +
                           prescribedMedicineCharges;

        System.out.println("\n--- OUTPATIENT BILL ---");
        displayDetails();
        System.out.println("Laboratory Charges: " + laboratoryCharges);
        System.out.println("Prescribed Medicine Charges: " + prescribedMedicineCharges);
        System.out.println("Total Bill: " + totalBill);
    }
}

// Main class
public class hierarchical_inheritance {
    public static void main(String[] args) {

        InPatient ip = new InPatient(101, "Rahul", 500, 3, 1500, 2000);

        OutPatient op = new OutPatient(102, "Amit", 500, 1000, 800);

        ip.calculateBill();

        op.calculateBill();
    }
}
