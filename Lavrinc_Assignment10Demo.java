/*
 * Samantha Lavrinc
 * CIT130-702B / 2019-11-07
 * JDK 1.8.0
 * This program creates and tests doubly linked lists.
 */

public class Lavrinc_Assignment10Demo {

    public static void main(String[] args) {

        System.out.println("-----Lavrinc_Assignment10_Demo-----");

        LinkedList3<String> demoList = new LinkedList3<>();

        demoList.addToStart("(4) Now it's Turkish delight on a moonlit night.");
        demoList.addToStart("(3) Been a long time gone, Oh Constantinople.");
        demoList.addToStart("(2) Now it's Istanbul, not Constantinople.");
        demoList.addToStart("(1) Istanbul was Constantinople.");

        System.out.println("\nThe following list has been created:");
        demoList.forward();

        System.out.println("\nIn Reverse:");
        demoList.reverse();

        System.out.print("\nTo String:");
        System.out.println(demoList.toString());

        System.out.println("\nList contains " + demoList.size() + " nodes.");

        String search1 = ("(3) Been a long time gone, Oh Constantinople.");
        System.out.println("\nSearching for... " + search1);
        String searchRes = null;
        try {
            searchRes = demoList.findData(search1);
            System.out.println("\"" + search1 + "\" has been found.");
        } catch (NullPointerException e) {
            System.out.println("\"" + search1 + "\" could not be found.");
        }

        String search2 = ("The end of the rainbow");
        System.out.println("\nSearching for... " + search2);
        try {
            searchRes = demoList.findData(search2);
            System.out.println("\"" + search2 + "\" has been found.");
        } catch (NullPointerException e) {
            System.out.println("\"" + search2 + "\" could not be found.");
        }

        LinkedList3<String> demoListCopy = new LinkedList3<>();
        demoListCopy = demoList;
        System.out.println("\ndemoList Copy contains: ");
        demoListCopy.forward();

        System.out.println("\nDeleting Head Node of Copy...");
        demoListCopy.deleteHeadNode();
        if (demoList.equals(demoListCopy)) {
            System.out.println("Original and Copy contain the same data references. "
                    + "\n*Shallow copy confirmed.");
        } else {
            System.out.println("Lists do not contain the same data references.");
        }

        System.out.println("\nTesting iterator method...");
        LinkedList3.LinkedList3Iterator i = demoList.iterator();
        i.restart();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("\nProcess Complete.\n");
    }
}
