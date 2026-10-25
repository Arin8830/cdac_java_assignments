package assignment6;

import java.util.Scanner;

class BankAccount {
    int accNo;
    String accName;
    double balance;

    BankAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accName);
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, String accName, double balance,
                   double interestRate) {
        super(accNo, accName, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest(int years) {
        return (balance * interestRate * years) / 100;
    }

    void displaySavings(int years) {
        System.out.println("\n--- Savings Account Details ---");
        display();
        System.out.println("Annual Interest Rate: " + interestRate + "%");

        double interest = calculateInterest(years);
        System.out.println("Interest: " + interest);

        balance = balance + interest;
        System.out.println("Balance After Interest: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accNo, String accName, double balance,
                   double overdraftLimit) {
        super(accNo, accName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal Not Allowed");
        }
    }

    void displayCurrent(double amount) {
        System.out.println("\n--- Current Account Details ---");
        display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Withdrawal Amount: " + amount);

        withdraw(amount);

        System.out.println("Updated Balance: " + balance);
    }
}

public class BankingServiceManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Savings Account Details ---");

        System.out.print("Enter Account Number: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance1 = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();
        sc.nextLine();

        SavingsAccount s1 = new SavingsAccount(
                id1, name1, balance1, rate);

        System.out.println("\n--- Enter Current Account Details ---");

        System.out.print("Enter Account Number: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance2 = sc.nextDouble();

        System.out.print("Enter Overdraft Limit: ");
        double limit = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        CurrentAccount c1 = new CurrentAccount(
                id2, name2, balance2, limit);

        s1.displaySavings(years);
        c1.displayCurrent(amount);

        sc.close();
    }
}
