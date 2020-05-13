/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-31
 * JDK 1.8.0 / NetBeans 8.2
 * This program creates two types of array lists and implements MyMathClass
 * to find the standard deviation.
 */

import java.util.ArrayList;

public class Lavrinc_MathDemo {

    public static void main(String[] args) {
        System.out.println("----------Standard Deviation Demo----------");

        ArrayList<Double> doubleArray = new ArrayList<>();
        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            doubleArray.add(new Double(i));
            intArray.add(i);
        }

        System.out.println("Standard deviation for numbers 0-9 type Double: " + MyMathClass.stdev(doubleArray)
                + "\nStandard deviation for numbers 0-9 type Integer: " + MyMathClass.stdev(intArray));

        System.out.println("Process complete!");
    }
}
