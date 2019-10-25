/*
 * Samantha Lavrinc
 * CIT130_702B / 2019-09-09
 * JDK 1.8.0 / Netbeans 8.2
 * This program will calculate inflation based on user input or return a response
 * based on an invalid entry.
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Lavrinc_CIT130_702B_inflationcalculator {

    public static void main(String[] args) {

        double cost, inflationrate, result; //used double in case inflation/cost isn't a whole number.
        int projection;
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        DecimalFormat percent = new DecimalFormat("0.00%");

        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the current cost of the item: "
                    + "\n(Format as ####.##): ");
            cost = keyboard.nextDouble();

            System.out.print("\nEnter the expected inflation rate per year"
                    + "\n(Format as ##.##, omit percent sign): ");
            inflationrate = keyboard.nextDouble();

            System.out.print("\nEnter the projection period in whole years: ");
            projection = keyboard.nextInt();
            if (cost > 0 && inflationrate > 0 && projection > 0) {
                int count = projection;
                double perc1 = (inflationrate * .01), sum = (cost * perc1), cost2 = cost;

                do {
                    double sum2 = cost2 * perc1; //formula according to  original assignment (eq2)
                    cost2 = sum2 + cost2;
                    count--;
                } while (count > 0);
                
                System.out.println("At " + (percent.format(inflationrate * .01))
                        + " inflation rate per year, the cost in " + projection
                        + " year(s) will be " + (moneyFormatter.format(cost2)));
                System.out.println("\nProcess completed.\n");

            } else {
                System.out.println("\nInvalid entry.\n");
            }

        } while (true);
    }
}
