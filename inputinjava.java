import java.util.*;

public class inputinjava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
       // String name=sc.next();   .next() is critical to spaces 
       // System.out.println(name);

        // String name= sc.nextLine();  // .nextline() is not critical to spaces
      //  System.out.println(name);
        
       // int number=sc.nextInt();
       // System.out.println(number); // for integer input

       float number=sc.nextFloat();
       System.out.println(number); // for float input
    }
    
}
