package assignment5;

import java.util.Scanner;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double accountBalance;

    static int accountCount = 0;
    static String bankName = "State Bank of India";

    // Parameterized constructor
    BankAccount(int number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        accountBalance = balance;
        accountCount++;
    }

    // Function to display account details
    void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: Rs. " + accountBalance);
        System.out.println("Bank Name: " + bankName);
    }

    // Function to display accounts and find highest balance
    static void displayAccounts(BankAccount[] b) {

        BankAccount highest = b[0];
        double totalBalance = 0;

        for (int i = 0; i < 2; i++) {

            b[i].display();

            totalBalance = totalBalance + b[i].accountBalance;

            if (b[i].accountBalance > highest.accountBalance) {
                highest = b[i];
            }
        }

        System.out.println("\n===== ACCOUNT WITH HIGHEST BALANCE =====");
        System.out.println("Account Number: " + highest.accountNumber);
        System.out.println("Account Holder: " + highest.accountHolderName);
        System.out.println("Balance: Rs. " + highest.accountBalance);

        System.out.println("\nCombined Balance: Rs. " + totalBalance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Accounts: " + accountCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] b = new BankAccount[2];

        // Input for 5 accounts
        for (int i = 0; i < 2; i++) {

            System.out.println("\nEnter details of Account " + (i + 1));

            System.out.print("Enter Account Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            b[i] = new BankAccount(number, name, balance);
        }

        // Call function
        displayAccounts(b);

        sc.close();
    }
}
