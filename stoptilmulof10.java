import java.util.*;

public class stoptilmulof10 {
    public static void main(String[] args){

    /*   int n = Integer.MAX_VALUE; // Set a high limit to keep asking until break condition is met

        for (int i = 1; i <= n; i++) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number % 10 == 0){
            System.out.println("The number " + number + " is a multiple of 10. Stopping the program.");
            break;
        } else {
            System.out.println("The number " + number + " is not a multiple of 10. Continuing...");
        
        }
      
     }  */

        Scanner sc = new Scanner(System.in);

        do {
            int n =sc.nextInt();
            System.out.println("You entered: " + n);
            if( n % 10 == 0){ // not a multiple of 10 
                break;
            }
        } while (true); // infinite loop 
    }
}
