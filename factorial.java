import java.util.*;

public class factorial {

    public static int factorialnumber(int n){ // any number n passed to factorial
        int fact = 1 ;   // this number n number's factorial is stored in fact , and this number is initialized to 1 

        for ( int i = 1; i <= n; i++ ){
            fact = fact * i; // purane number ke factorial se i ko multiply krna hai naye wale ko 
        }
        return fact; // returning factorial value
    }



    public static void main(String args[] ){
        
        Scanner sc = new Scanner ( System.in );
     /*   System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int result = factorialnumber(n); // function call
        System.out.println("The factorial of " + n + " is: " + result); */  // user input and output

        // new way of output without user input 
        System.out.println ( factorialnumber(4)); // factorial of a number 4
    }
} 