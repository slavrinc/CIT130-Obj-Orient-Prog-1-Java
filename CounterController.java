/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-18
 * JDK 1.8.0 / NetBeans 8.2
 * This class creates and begins a timer.
 */

public class CounterController {

    private int startValue, endValue;

    public CounterController() {
        startValue = 0;
        endValue = 0;
    }

    public CounterController(int startTime, int endTime) {
        startValue = startTime;
        endValue = endTime;
    }

    public void start() {
        System.out.println("CounterController Starting."
                + "\n");
        CounterModel startCount = new CounterModel(startValue);
        int i = startValue;

        while (i < endValue) {
            startCount.increment();
            i++;
        }
    }

}
