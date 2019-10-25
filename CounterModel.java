/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-18
 * JDK 1.8.0 / NetBeans 8.2
 * This class creates and implements a counter.
 */

public class CounterModel {

    private int count;

    public CounterModel() {
        count = 0;
    }

    public CounterModel(int initialValue) {
        count = initialValue;
    }

    public void increment() {
        try {
            Thread.sleep(1000);
            count++;
            CounterView.display(count);
            
        } catch (InterruptedException e) {
            System.out.println("Error: Count inturrupted.");
        }
    }

}
