/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-18
 * JDK 1.8.0 / NetBeans 8.2
 * This program creates and implements a seconds based timer.
 */

import java.util.Scanner;

public class Lavrinc_counterDemoUML {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String selection = null;

        System.out.println("--------------------Configuration: <Default>--------------------"
                + "\nThis progam tests a timer.");

        do {
            System.out.println("Enter a start number of seconds: ");
            int startTime = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter an end number of seconds: ");
            int endTime = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println(" ");

            CounterController testTimer = new CounterController(startTime, endTime);
            testTimer.start();

            System.out.println("\nWould you like to continue? (Y/N): ");
            selection = keyboard.nextLine().toUpperCase();

        } while (selection.equals("Y"));

        System.out.println("Process Complete.");
        System.exit(0);
    }

}
