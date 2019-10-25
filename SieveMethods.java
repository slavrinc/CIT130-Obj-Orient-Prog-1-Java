/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-20
 * JDK 1.8.0 / NetBeans 8.2
 * This class contains the methods used to find prime values based on the
 * Sieve of Eratosthenes process.
 */

public class SieveMethods {

    //boolean method
    public void primeSieveboo(int rangeMax) {
        //new array 
        boolean isPrime[] = new boolean[rangeMax + 1];

        //setting all values in isPrime array to 'true'
        for (int i = 0; i < rangeMax; i++) {
            isPrime[i] = true;
        }
        //checking multiples, starting with 2
        for (int s = 2; s * s <= rangeMax; s++) {
            if (isPrime[s] == true) {
                for (int i = s * 2; i <= rangeMax; i += s) {
                    isPrime[i] = false;
                }
            }
        }
        //prints 10 isPrime true values per line
        int counter = 1;
        for (int i = 2; i <= rangeMax; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 11) {
                System.out.println("");
                counter = 1;
            }
        }
    }

    //zero value method
    public void primeSieveint(int rangeMax) {
        int prime[] = new int[rangeMax + 1];
        for (int i = 0; i < rangeMax; i++) {
            prime[i] = 1;
        }
        for (int p = 2; p * p <= rangeMax; p++) {
            if (prime[p] == 1) {
                // Update all multiples of p 
                for (int i = p * 2; i <= rangeMax; i += p) {
                    prime[i] = 0;
                }
            }
        }
        // Print all prime numbers 
        int counter = 1;
        for (int i = 2; i <= rangeMax; i++) {
            if (prime[i] == 1) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 11) {
                System.out.println("");
                counter = 1;
            }
        }

    }
}
