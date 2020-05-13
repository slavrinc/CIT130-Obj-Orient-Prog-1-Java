/*
 * Samantha Lavrinc
 * CIT130-702B / 2019-11-13
 * JDK 1.8.0 / NetBeans 8.2
 * This program uses a hashset to track birthday collisions within a Monte Carlo 
 * simulation.
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lavrinc_BirthdayParadox_Demo {

    public static void main(String[] args) {
        System.out.println("-------------Lavrinc_BirthdayParadox_Demo-------------");

        Set<Integer> birthdayTracker = new HashSet<>();
        Random r = new Random();
        int simIteration = 100000;
        int people = 10;

        //each set of 10 people until 100
        while (people <= 100) {
            float collisions = 0;
            float simRes = 0;

            //complete 100000 iterations
            for (int simCounter = 0; simCounter < simIteration; simCounter++) {
                birthdayTracker.clear();

                //create random birthday for each person and add to hashset
                for (int i = 0; i < people; i++) {
                    int randomBirthday = r.nextInt(365);

                    //compare new bday to saved hashset bday
                    if (birthdayTracker.contains(randomBirthday)) {
                        collisions++;
                        break;
                    }
                    birthdayTracker.add(randomBirthday);
                }
                simRes = collisions / simIteration;
            }
            System.out.println("After " + simIteration + " tests there were "
                    + Math.round(collisions) + " shared birthdays in a set of "
                    + people + " people.");
            System.out.println("Probability: " + simRes);

            people = people + 10;
        }
        System.out.println("\nProcess Complete.");
    }
}
