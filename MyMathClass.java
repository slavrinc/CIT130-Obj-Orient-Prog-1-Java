/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-31
 * JDK 1.8.0 / NetBeans 8.2
 * This class finds the standard deviation.
 */

import java.util.ArrayList;

public class MyMathClass<T extends Number> {

    public static <T extends Number> double stdev(ArrayList<T> a) {
        double average = 0;
        double stDev = 0;
        double total = 0;

        for (T contents : a) {
            total = (total + contents.doubleValue());
        }

        average = (total / a.size());

        for (T contents : a) {
            stDev = (stDev + Math.pow((contents.doubleValue() - average), 2));
        }

        stDev = Math.sqrt(stDev / (a.size() - 1));
        return stDev;
    }
}
