import java.util.*;

public class productaandb {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    int product = multiply(a, b);
    System.out.println("The product of " + a + " and " + b + " is: " + product);
    int prod = multiply(5, 10);
    System.out.println("The product of 5 and 10 is: " + prod);

}
}