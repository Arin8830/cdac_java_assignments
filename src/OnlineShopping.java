package assignment6;

import java.util.Scanner;

class Order {
    int orderid;
    String orderdate;
    float orderamount;

    Order(int orderid, String orderdate, float orderamount) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.orderamount = orderamount;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderid);
        System.out.println("Order Date: " + orderdate);
        System.out.println("Order Amount: " + orderamount);
    }
}

class DeliveryOrder extends Order {
    String daddress;
    float dcharges;
    int ddays;

    DeliveryOrder(int orderid, String orderdate, float orderamount,
                  String daddress, float dcharges, int ddays) {

        super(orderid, orderdate, orderamount);

        this.daddress = daddress;
        this.dcharges = dcharges;
        this.ddays = ddays;
    }

    void displayDetails() {
        displayOrder();

        System.out.println("Delivery Address: " + daddress);
        System.out.println("Delivery Charges: " + dcharges);
        System.out.println("Expected Delivery Days: " + ddays);
        System.out.println("Total Payable Amount: "
                + (orderamount + dcharges));
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Order Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Order Amount: ");
        float amount = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Delivery Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Delivery Charges: ");
        float charges = sc.nextFloat();

        System.out.print("Enter Expected Delivery Days: ");
        int days = sc.nextInt();

        DeliveryOrder d = new DeliveryOrder(
                id, date, amount, address, charges, days);

        System.out.println("\n--- Order Details ---");
        d.displayDetails();

        sc.close();
    }
}
