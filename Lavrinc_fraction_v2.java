/*
 * Samantha Lavrinc 
 * CIT 130-702B / 2019-10-09
 * JDK 1.8.0 / NetBeans 8.2
 * This program tests the zero exception class.
 */

import java.util.Scanner;

public class Lavrinc_fraction_v2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        fractionadt fraction;
        String restart;
        int n, d;

        do {
            try {
                System.out.print("Please enter the numerator: ");
                n = keyboard.nextInt();
                System.out.print("Please enter the denominator: ");
                d = keyboard.nextInt();
                if (d == 0) {
                    throw new DenominatorIsZeroException();
                }
                fraction = new fractionadt(n, d);
                double d2 = d;
                double n2 = n;
                double result = n2 / d2;
                System.out.println("" + fraction + " = " + result);

            } catch (DenominatorIsZeroException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\nWould you like to restart? (Y/N) ");
            restart = keyboard.next().toUpperCase();
        } while (restart.equals("Y"));

        System.out.println("\nProcess Complete.");

    }

}
