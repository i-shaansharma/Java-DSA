import java.util.*;

public class binomialcoeff {
    
     public static int factorialnumber(int n){ // any number n passed to factorial
        int fact = 1 ;   // this number n number's factorial is stored in fact , and this number is initialized to 1 

        for ( int i = 1; i <= n; i++ ){
            fact = fact * i; // purane number ke factorial se i ko multiply krna hai naye wale ko 
        }
        return fact   ; // returning factorial value
    }

    public static int bincoeff(int n , int r ) {
        int fact_r=factorialnumber(r);
        int fact_n=factorialnumber(n);
        int fact_n_r=factorialnumber(n-r);   //factorialnumber(n-r); factorial function doing n-r 
        return fact_n/(fact_r*fact_n_r);
    }

    public static void main(String args[] ){
        
        Scanner sc =  new Scanner ( System.in );
        System.out.print("Enter n (total items): ");
        int n = sc.nextInt();
        System.out.print("Enter r (items to choose): ");
        int r = sc.nextInt();
        int result = bincoeff(n, r);
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
    }

}