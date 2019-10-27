/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-23
 * JDK 1.8.0 / Netbeans 8.2
 * This program tests the generic binary search.
 */

import java.util.Arrays;

public class Lavrinc_binarySearchDemo {

    public static void main(String[] args) {

        Integer[] numArray = {2, 18, 4, 6, 0, 10, 12, 16, 14, 8};
        String[] fruitArray = {"Watermelon", "Peach", "Strawberry", "Orange", "Apple"};
        int result, key;

        Arrays.sort(numArray);
        Arrays.sort(fruitArray);

        System.out.println("Integer test array contains: "
                + "\n" + Arrays.toString(numArray).replace("[", "").replace("]", ""));

        for (key = -3; key <= 4; key++) {
            result = binarySearch.<Integer>search(numArray, 0, numArray.length, key);
            binarySearch.toString(Integer.toString(key), result);
        }

        System.out.println("\nString test array contains: "
                + "\n" + Arrays.toString(fruitArray).replace("[", "").replace("]", ""));

        result = binarySearch.<String>search(fruitArray, 0, fruitArray.length, "Apple");
        binarySearch.toString("Apple", result);

        result = binarySearch.<String>search(fruitArray, 0, fruitArray.length, "Plum");
        binarySearch.toString("Plum", result);

        System.out.println("\nProcess Complete.");
    }
}
