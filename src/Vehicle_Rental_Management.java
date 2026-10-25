package assignment6;

import java.util.Scanner;

class Vehicle1 {
    String regNo;
    String brand;
    float rate;

    Vehicle1(String regNo, String brand, float rate) {
        this.regNo = regNo;
        this.brand = brand;
        this.rate = rate;
    }

    void display() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate Per Day: " + rate);
    }
}

class CarRental extends Vehicle1 {
    int seats;
    float driverCharges;
    int days;

    CarRental(String regNo, String brand, float rate,
              int seats, float driverCharges, int days) {
        super(regNo, brand, rate);
        this.seats = seats;
        this.driverCharges = driverCharges;
        this.days = days;
    }

    double calculateRent() {
        return (rate + driverCharges) * days;
    }

    void displayCar() {
        System.out.println("\n--- Car Rental Details ---");
        display();
        System.out.println("Number of Seats: " + seats);
        System.out.println("Driver Charges Per Day: " + driverCharges);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rental Amount: " + calculateRent());
    }
}

class BikeRental extends Vehicle1 {
    int cc;
    float helmetCharges;
    int days;

    BikeRental(String regNo, String brand, float rate,
               int cc, float helmetCharges, int days) {
        super(regNo, brand, rate);
        this.cc = cc;
        this.helmetCharges = helmetCharges;
        this.days = days;
    }

    double calculateRent() {
        return (rate * days) + helmetCharges;
    }

    void displayBike() {
        System.out.println("\n--- Bike Rental Details ---");
        display();
        System.out.println("Engine Capacity: " + cc + " CC");
        System.out.println("Helmet Charges: " + helmetCharges);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rental Amount: " + calculateRent());
    }
}

public class Vehicle_Rental_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Car Details ---");

        System.out.print("Enter Registration Number: ");
        String reg1 = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand1 = sc.nextLine();

        System.out.print("Enter Rental Rate Per Day: ");
        float rate1 = sc.nextFloat();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        System.out.print("Enter Driver Charges Per Day: ");
        float driver = sc.nextFloat();

        System.out.print("Enter Rental Days: ");
        int days1 = sc.nextInt();
        sc.nextLine();

        CarRental c1 = new CarRental(
                reg1, brand1, rate1, seats, driver, days1);

        System.out.println("\n--- Enter Bike Details ---");

        System.out.print("Enter Registration Number: ");
        String reg2 = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand2 = sc.nextLine();

        System.out.print("Enter Rental Rate Per Day: ");
        float rate2 = sc.nextFloat();

        System.out.print("Enter Engine Capacity (CC): ");
        int cc = sc.nextInt();

        System.out.print("Enter Helmet Charges: ");
        float helmet = sc.nextFloat();

        System.out.print("Enter Rental Days: ");
        int days2 = sc.nextInt();

        BikeRental b1 = new BikeRental(
                reg2, brand2, rate2, cc, helmet, days2);

        c1.displayCar();
        b1.displayBike();

        sc.close();
    }
}
