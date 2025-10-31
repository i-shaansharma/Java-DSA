import java.util.*;

public class incometaxcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your income:");
        float income=sc.nextFloat();
        // int tax; // tax variable automatically initialized to 0 

        if(income<500000){
            //tax = (int)(income*0);
            System.out.println("Tax is 0 ");
        }
        else if(income>=500000 && income<=1000000){
            //tax = (int)(income*0.2); type casting it otherwise java will assume 0.2 as double saved to integer
            System.out.println("Tax is 20% "+ income*.2);
        }
        else {
            //tax = (int)(income*0.3);
            System.out.println("Tax is 30% "+ income*.3);
        }
        
    }
}
