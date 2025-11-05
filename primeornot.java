import java.util.*;

public class primeornot {

    public static boolean isprime(int n){
    /*   if(n==1){

corner cases

        }  */

        boolean isprime =true;
        for ( int i =2 ; i <= n-1 ; i++ ){
            if(n%i==0){
                isprime = false;
               return false; // rather than writing return isprime; we wrote is false
            }
    }  
    
    return true;
}

    public static void main( String args []){
        System.out.println(isprime(10));
    }

}

