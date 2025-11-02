import java.util.*;

public class primeornotprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true; // value assumed to be true at first
                            // Math.sqrt(n) is used and imported by import java.util.*; its under root of n .
        for (int i = 2 ; i <= Math.sqrt(n); i++) { // rather than n-1 we optimized it to under root n so that search time reduces to half.
            if (n % i == 0) {
                isprime = false; // if n is divisible by any number other than 1 and itself, it is not prime
                break;
            }
        }
        
        if (isprime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}


// math.sqrt() function is used to calculate the square root of a number. It is a static method of the Math class in Java. The function takes a single argument, which is the number for which you want to find the square root, and returns the square root as a double value. For example, Math.sqrt(16) would return 4.0, since the square root of 16 is 4.\

// this method reduces cost function to find the prime number by seeing distinct multiplicatives of a number

// rather than n-1 we ended loop at under root n Math.sqrt(n) because any factor larger than the square root of n must be multiplied by a factor smaller than the square root of n. Therefore, if n is not prime, it must have at least one factor less than or equal to its square root. This optimization reduces the number of iterations needed to check for primality, making the algorithm more efficient.