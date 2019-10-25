/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-10-10
 * JDK v 1.8.0 / NetBeans v 8.2
 * This program demonstrates text and binary file creation.
 */

import java.util.Scanner;

public class Lavrinc_demoIO {

    public static void main(String[] args) {
        int restart = 0;
        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("*****Lavrinc_demoIO*****"
                    + "\nPlease enter the desired name of your file:");
            String filename = keyboard.nextLine();
            System.out.println("Select a file type (b/t): ");
            String filetype = keyboard.nextLine().toUpperCase();

            switch (filetype) {
                case "B": //binary selection
                    System.out.println("You have selected Binary file.");
                    restart = 0;
                    System.out.println("Select read or write (r/w): ");
                    String inputtype = keyboard.nextLine().toUpperCase();

                    switch (inputtype) {
                        
                        case "W": //write binary
                                binaryMethods writeBinaryFile = new binaryMethods(filename);
                                writeBinaryFile.writeBinary();
                            break;
                            
                        case "R": //read binary
                            binaryMethods readBinaryFile = new binaryMethods(filename);
                            readBinaryFile.readBinary();
                            break;
                            
                        default: //invalid selection
                            System.out.println("Invalid Selection.");
                            break;
                    }
                    break;

                case "T": //text selection
                    System.out.println("You have selected Text file.");
                    restart = 0;
                    System.out.println("Select read or write (r/w): ");
                    String inputtype2 = keyboard.nextLine().toUpperCase();

                    switch (inputtype2) {
                        case "W": //write text
                            String selection = null;
                            do {
                                System.out.println("You have selected Write Text File."
                                        + "\nPlease enter the file contents:");
                                String innertext2 = keyboard.nextLine();
                                textMethods writeTextFile = new textMethods((innertext2), (filename));
                                writeTextFile.writeToFile();
                                System.out.println("Would you like to continue writing? (y/n): ");
                                selection = keyboard.nextLine().toUpperCase();
                            } while (selection.equals("Y"));
                            break;

                        case "R": //read text
                            System.out.println("You have selected Read Text File.");
                            textMethods readTextFile = new textMethods((null), (filename));
                            readTextFile.readFile();
                            break;

                        default: //invalid selection
                            System.out.println("Invalid selection.");
                            break;
                    }
                    break;
                default: //invalid selection
                    System.out.println("Invalid selection.");
                    break;
            }

            System.out.println("Would you like to restart? (y/n): ");
            String selection = keyboard.nextLine().toUpperCase();
            if (selection.equals("Y")) {
                restart = 1;
            }
        } while (restart == 1);

        System.out.println("Process Complete.");
        System.exit(0);
    }
} 
