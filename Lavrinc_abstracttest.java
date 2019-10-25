/*
 * Samantha Lavrinc 
 * CIT 130-702B / 2019-09-18
 * JDK 1.8.0 / NetBeans 8.2
 * This program tests the fraction adt file.
 */

import java.util.Scanner;

public class Lavrinc_abstracttest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        fractionadt fraction1, fraction2;
        String restart;
        int n, d;

        //user prompt
        System.out.print("Enter the numerator for the target fraction: ");
        n = keyboard.nextInt();
        System.out.print("Enter the denominator for the target fraction: ");
        d = keyboard.nextInt();
        fraction1 = new fractionadt(n, d);

        do {
            System.out.print("\nEnter the numerator for the next fraction to test: ");
            n = keyboard.nextInt();
            System.out.print("Enter the denominator for the next fraction to test: ");
            d = keyboard.nextInt();
            fraction2 = new fractionadt(n, d);

            //print results
            if (fraction1.equals(fraction2)) {
                System.out.println("The fraction you just entered equals the first"
                        + " fraction of " + fraction1);
            } else {
                System.out.println("The fraction you just entered does not equal "
                        + "the first fraction of " + fraction1);
            }

            //prompt to continue
            System.out.print("\nWould you like to continue? (Y/N) ");
            restart = keyboard.next().toUpperCase();
        } while (restart.equals("Y"));

        System.out.println("\nProcess Complete.");

    }

}
