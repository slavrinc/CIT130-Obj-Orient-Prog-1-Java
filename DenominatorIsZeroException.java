/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-18
 * JDK 1.8.0 / NetBeans 8.2
 * This class extends 
 */

public class DenominatorIsZeroException extends Exception {

    public DenominatorIsZeroException() {
        super("You cannot divide by Zero!");
    }

    public DenominatorIsZeroException(String message) {
        super(message);
    }

}
