/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-23
 * JDK 1.8.0 / Netbeans 8.2
 * This class implements a recursive generic binary search.
 */

public class binarySearch {

    public static <T extends Comparable<T>> int search(T[] contents, int first, int last, T key) {
        int result = 0;

        if (first > last) {
            result = -1;
        } else {
            int mid = (first + last) / 2;

            if (key.compareTo(contents[mid]) == 0) {
                result = mid;

            } else if (key.compareTo(contents[mid]) < 0) {
                result = search(contents, first, mid - 1, key);

            } else if (key.compareTo(contents[mid]) > 0) {
                result = search(contents, last, mid + 1, key);
            }
        }
        return result;
    }

    public static void toString(String key, int result) {
        if (result == -1) {
            System.out.println(key + " is not in the array.");
        } else {
            System.out.println(key + " is at index " + result + ".");
        }
    }
}
