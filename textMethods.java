/* Samantha Lavrinc
* CIT 130-702B / 2019-10-10
* JDK v 1.8.0 / Netbeans v. 2
* This is a class to write and read text files.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class textMethods {

    private final String textTest, tFileName;

    public textMethods() {
        textTest = null;   //file constructor doesn't necessarily need file contents.
        tFileName = "tdefault.txt"; //file constructor does need a file save location.
    }

    public textMethods(String innerText, String textFileName) {
        textTest = innerText;
        tFileName = textFileName + ".txt";
    }

    public void writeToFile() {
        PrintWriter outputStream = null;
        try {
            outputStream
                    = new PrintWriter(new FileOutputStream(tFileName, true));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the stream.");
            System.exit(0);
        }
        System.out.println("Writing to file.");
        outputStream.println(textTest);
        outputStream.close();
    }

    public void readFile() {
        Scanner inputStream = null;
        String line = null;
        try {
            inputStream
                    = new Scanner(new FileInputStream(tFileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the stream.");
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
          line = inputStream.nextLine();
            System.out.println(line);
        }  
        inputStream.close();
    }
}
