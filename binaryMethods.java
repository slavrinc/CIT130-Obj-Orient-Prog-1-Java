/* Samantha Lavrinc
* CIT 130-702B / 2019-10-10
* JDK v 1.8.0 / Netbeans v. 2
* This is a class to write and read binary files.
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class binaryMethods implements Serializable {

    private final String bfilename;

    public binaryMethods() {
        bfilename = "bdefault.dat";
    }

    public binaryMethods(String binaryfilename) {
        bfilename = binaryfilename + ".dat";
    }

    public void writeBinary() {
        try {
            ObjectOutputStream outputStream2
                    = new ObjectOutputStream(new FileOutputStream(bfilename, true));
            String selection = null;
            Scanner keyboard = new Scanner(System.in);
            StringBuilder content = new StringBuilder();

            do {
                System.out.println("You have selected Write Binary File."
                        + "\nPlease enter the file contents:");
                String innertext = keyboard.nextLine();
                content.append("\n" + innertext);
                System.out.println("Would you like to continue writing? (y/n): ");
                selection = keyboard.nextLine().toUpperCase();
            } while (selection.equals("Y"));

            outputStream2.writeUTF(content.toString());
            System.out.println("Binary file has been written.");
            outputStream2.close();

        } catch (IOException e) {
            System.out.println("Error creating stream.");
        }
    }

    public void readBinary() {
        System.out.print("You have selected Read Binary File.");
        try {
            ObjectInputStream inputStream2
                    = new ObjectInputStream(new FileInputStream(bfilename));
            String lineb = null;
            try {
                do {
                    lineb = inputStream2.readUTF();
                    System.out.print(lineb);
                } while (lineb != null);
            } catch (EOFException e) {
                System.out.println("\nNo more data in this file.");
            }
            inputStream2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error creating stream.");
        } catch (IOException e) {
            System.out.println("Unable to read next lines.");
        }
    }
}
