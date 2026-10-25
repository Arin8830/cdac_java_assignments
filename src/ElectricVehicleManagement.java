package assignment6;

import java.util.Scanner;

class Vehicle {
    int vehicleId;
    String brand;
    int manufacturingYear;

    Vehicle(int vehicleId, String brand, int manufacturingYear) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
    }

    void displayVehicle() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
}

class MotorVehicle extends Vehicle {
    int engineCapacity;
    String fuelType;

    MotorVehicle(int vehicleId, String brand, int manufacturingYear,
                 int engineCapacity, String fuelType) {

        super(vehicleId, brand, manufacturingYear);

        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    void displayMotorVehicle() {
        displayVehicle();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricVehicle extends MotorVehicle {
    float batteryCapacity;
    float drivingRange;
    float chargingTime;

    ElectricVehicle(int vehicleId, String brand, int manufacturingYear,
                    int engineCapacity, String fuelType,
                    float batteryCapacity, float drivingRange,
                    float chargingTime) {

        super(vehicleId, brand, manufacturingYear,
              engineCapacity, fuelType);

        this.batteryCapacity = batteryCapacity;
        this.drivingRange = drivingRange;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        displayMotorVehicle();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - manufacturingYear;

        System.out.println("Vehicle Age: " + age + " years");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Driving Range: " + drivingRange + " km");
        System.out.println("Charging Time: " + chargingTime + " hours");

        if (drivingRange > 0) {
            float energyConsumption = batteryCapacity / drivingRange;

            System.out.println("Energy Consumption: "
                    + energyConsumption + " kWh/km");
        } else {
            System.out.println("Energy Consumption: Cannot calculate range is zero.");
        }
    }
}

public class ElectricVehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Engine Capacity (CC): ");
        int cc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuel = sc.nextLine();

        System.out.print("Enter Battery Capacity (kWh): ");
        float battery = sc.nextFloat();

        System.out.print("Enter Driving Range (km): ");
        float range = sc.nextFloat();

        System.out.print("Enter Charging Time (hours): ");
        float charging = sc.nextFloat();

        ElectricVehicle ev = new ElectricVehicle(
                id, brand, year, cc, fuel,
                battery, range, charging);

        System.out.println("\n--- Electric Vehicle Details ---");
        ev.displayDetails();

        sc.close();
    }
 }