
package assignment_2;

import java.util.Scanner;

public class largest_of_two_numbers {

    static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        int largest = findLargest(a, b);

        System.out.println("Largest number: " + largest);

        s.close();
    }
}
