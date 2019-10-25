/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-27
 * JDK 1.8.0 / NetBeans 8.2
 * This program tests the wrapper deep and wrapper shallow classes.
 */

public class Lavrinc_wrapperdemo {

    public static void main(String[] args) {
        System.out.println("------------------Configuration: <Default>------------------");

        //shallow test
        System.out.println("\n**** TESTING SHALLOW OBJECTS ****");
        WrapperShallow shallowtest1 = new WrapperShallow(7, 17, 77);
        WrapperShallow shallowtest2 = new WrapperShallow(shallowtest1);
        
        System.out.println("\ninital shallow object contains"
                + "\n" + shallowtest1);
        System.out.println("copy shallow object contains"
                + "\n" + shallowtest2);
        
        shallowtest1.setArray(13, 14, 15);
        System.out.println("inital shallow object set to"
                + "\n" + shallowtest1);
        System.out.println("copy shallow object now contains"
                + "\n" + shallowtest2);

        if (shallowtest1.equals(shallowtest2)) {
            System.out.println("WOOPS! shallowtest1.equals(shallowtest2) is true");
        } else {
            System.out.println("RIGHT! shallowtest1.equals(shallowtest2) is false");
        }

        //deep test
        System.out.println("\n**** TESTING DEEP OBJECTS ****");
        WrapperDeep deeptest1 = new WrapperDeep(2, 3, 4);
        WrapperDeep deeptest2 = new WrapperDeep(deeptest1);
        
        System.out.println("\ninital deep object contains"
                + "\n" + deeptest1);
        System.out.println("copy deep object contains"
                + "\n" + deeptest2);
        
        deeptest1.setArray(7, 6, -5);
        System.out.println("inital deep object set to"
                + "\n" + deeptest1);
        System.out.println("copy deep object now contains"
                + "\n" + deeptest2);

        if (deeptest1.equals(deeptest2)) {
            System.out.println("WOOPS! deeptest1.equals(deeptest2) is true");
        } else {
            System.out.println("RIGHT! deeptest1.equals(deeptest2) is false");
        }
        System.out.println("\nProcess completed.");

    }
}
