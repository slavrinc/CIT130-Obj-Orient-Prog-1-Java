/*
 * Samantha Lavrinc
 * CIT-130-702B / 2019-09-12
 * JDK v. 1.8.0 / Netbeans v. 8.2
 * This program creates and uses counters.
 */

public class Lavrinc_countertest {

    public static void main(String[] args) {

        counter counter1 = new counter();
        counter counter2 = new counter();

        //counter set to 0 test
        counter1.reset();
        counter2.reset();

        System.out.println("This program tests and uses the methods found in counter class.\n"
                + "\nInitial State: "
                + "\ncounter1 is at" + counter1 + "."
                + "\ncounter2 is at" + counter2 + ".");
        if (counter1.equals(counter2)) {
            System.out.println("counter1 equals counter2.");
        } else {
            System.out.println("counter1 does not equal counter2.");
        }

        //counter decrement test from 0
        counter1.decrement();

        //test reset
        counter1.reset();
        counter2.reset();
        System.out.println("counter1 reset to" + counter1
                + "\ncounter2 reset to" + counter2);

        //counter increment test
        counter1.increment();
        System.out.println("\nState after first test:"
                + "\ncounter1 is at" + counter1
                + "\ncounter2 is at" + counter2);
        if (counter1.equals(counter2)) {
            System.out.println("counter1 equals counter2.");
        } else {
            System.out.println("counter1 does not equal counter2.");
        }

        //constructor override test
        counter1 = new counter(5); //set to different values to ensure no overwrites.
        counter2 = new counter(2);
        System.out.println("\nState after second test:"
                + "\ncounter1 is at" + counter1
                + "\ncounter2 is at" + counter2);
        if (counter1.equals(counter2)) {
            System.out.println("counter1 equals counter2.");
        } else {
            System.out.println("counter1 does not equal counter2.");
        }

        //second decrement test to return valid entry
        counter1.decrement();
        System.out.println("\nState after third test:"
                + "\ncounter1 is at" + counter1
                + "\ncounter2 is at" + counter2);
        if (counter1.equals(counter2)) {
            System.out.println("counter1 equals counter2.");
        } else {
            System.out.println("counter1 does not equal counter2.");
        }

        System.out.println("\nProcess complete.");

    }
}
