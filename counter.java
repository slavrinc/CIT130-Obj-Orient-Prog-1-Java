/*
 * Samantha Lavrinc
 * CIT-130-702B / 2019-09-12
 * JDK 1.8.0 / Netbeans v 8.2
 * This program is a counter.
 */

public class counter {

    //private state variable
    private int count;

    //default constructor
    public counter() {
        count = 0;
    }

    //constructor override
    public counter(int c) {
        count = c;
    }

    //accessor
    public int getCount() {
        return count;
    }

    //reset option
    public void reset() {
        count = 0;
    }

    //increment mutator
    public void increment() {
        count++;
    }

    //decrement mutator
    public void decrement() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("\nError - Attempted to subtract 1 Counter from 0 Counter.");
        }
    }

    //"polymorph" tostring..
    @Override
    public String toString() {
        return (" " + count);
    }

    //boolean method
    public boolean equals(counter f) {
        return this.getCount() == f.getCount();
    }

}
