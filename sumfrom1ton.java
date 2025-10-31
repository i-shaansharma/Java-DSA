import java.util.*;

public class sumfrom1ton {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number till which you want sum: ");
        int n = sc.nextInt();
        int sum = 0;
        int i =1 ;

        while(i <=n ) {
            sum += i ;
            i++;
        }
       System.out.println("The sum from 1 to " + n + " is: " + sum);
    }
}
