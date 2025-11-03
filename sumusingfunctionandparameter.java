import java.util.*;

public class sumusingfunctionandparameter {
 /*    public static void sumthisup(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
*/

        public static int sumthisup(int a, int b) {
        int sum = a + b;
        return sum;
        // printing in main function
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        sumthisup(a, b);
        int sum = sumthisup(a, b);  // storing returned value with the help of assignment operator =
        System.out.println("The sum is: " + sum);
   }
}
