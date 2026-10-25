package assignment7;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double accountBalance;

    BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    void deposit(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Transaction Type: Normal Deposit");
        System.out.println("Balance: " + accountBalance);
    }

    void deposit(double amount, String transactionReference) {
        accountBalance = accountBalance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
        System.out.println("Balance: " + accountBalance);
    }

    void deposit(double amount, String transactionReference, String depositMode) {
        accountBalance = accountBalance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Transaction Reference: " + transactionReference);
        System.out.println("Deposit Mode: " + depositMode);
        System.out.println("Balance: " + accountBalance);
    }

    void displayAccount() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Balance: " + accountBalance);
    }
}

public class Banking_Transaction_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(accountNumber, name, balance);

        System.out.print("\nEnter deposit amount: ");
        double amount = sc.nextDouble();
        b.deposit(amount);

        sc.nextLine();

        System.out.print("\nEnter deposit amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter transaction reference: ");
        String reference = sc.nextLine();
        b.deposit(amount, reference);

        System.out.print("\nEnter deposit amount: ");
        amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter transaction reference: ");
        reference = sc.nextLine();

        System.out.print("Enter deposit mode: ");
        String mode = sc.nextLine();

        b.deposit(amount, reference, mode);

        b.displayAccount();

        sc.close();
    }
}
