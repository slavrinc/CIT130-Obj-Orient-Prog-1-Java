/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-20
 * JDK 1.8.0 / NetBeans 8.2
 * This program tests the methods used to find prime values based on user input.
 */

import java.util.Scanner;

public class SieveTest {

    public static void main(String[] args) {
        //test driver
        int rangeMax;
        String selection;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the highest number to "
                + "check (must be higher than 2): ");
        rangeMax = keyboard.nextInt();
        System.out.println("Enter a process method to test:"
                + "\n(A) - Boolean Array Method"
                + "\n(B) - Set to Zero Array Method ");
        selection = keyboard.next().toUpperCase();

        //boolean results
        if (selection.equals("A")) {
            System.out.println("The prime numbers between 2 and " + rangeMax
                    + " found using the Boolean Array Method are: ");
            SieveMethods x = new SieveMethods();
            x.primeSieveboo(rangeMax);
            System.out.println("\nProcess Complete.");
        }
        //zero method results
        if (selection.equals("B")) {
            System.out.println("The prime numbers between 2 and " + rangeMax
                    + " found using the Zero Array Method are: ");
            SieveMethods y = new SieveMethods();
            y.primeSieveint(rangeMax);
            System.out.println("\nProcess Complete.");
        }
    }
}
