/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-18
 * JDK 1.8.0 / NetBeans 8.2
 * This class creates and compares fraction values.
 */

public class fractionadt {

    //private state variable
    private final int numerator, denominator;

    //default constructor
    public fractionadt() {
        numerator = 0;
        denominator = 1;
    }

    //constructor override
    public fractionadt(int n, int d) {
        numerator = n;
        denominator = d;
    }

    //numerator accessor
    public int getNumerator() {
        return numerator;
    }

    //denominator accessor
    public int getDenominator() {
        return denominator;
    }

    //polymorph toString
    @Override
    public String toString() {
        return (numerator + "/" + denominator);
    }

    //boolean method
    public boolean equals(fractionadt f) {
        return getNumerator() * f.getDenominator() == getDenominator() * f.getNumerator();
    }
}
