
package assignment_2;

import java.util.Scanner;

public class voting_eligibility {

    static boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if (isEligible(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        s.close();
    }
}
