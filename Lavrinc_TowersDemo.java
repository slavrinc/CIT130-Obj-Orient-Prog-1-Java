/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-16
 * JDK 1.8.0 / NetBeans v. 8.2
 * This program implements the Towers of Hanoi puzzle.
 */

import java.util.Scanner;

public class Lavrinc_TowersDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int disktotal = keyboard.nextInt();

        solvePuzzle(disktotal, "first pole", "middle pole", "last pole");
        System.out.println("Process Complete.");
    }

    public static void solvePuzzle(int d, String startRod, String destRod, String extraRod) {
        if (d == 1) {
            System.out.println("Disk " + d + " moved from " + startRod + " to " + destRod + ".");
        } else {
            solvePuzzle(d - 1, startRod, extraRod, destRod);
            System.out.println("Disk " + d + " moved from " + startRod + " to " + destRod + ".");
            solvePuzzle(d - 1, extraRod, destRod, startRod);
        }
    }
}
