import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Operation to perform: +, -, *, /, %");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+':  System.out.println("The sum is: " + (a + b));
            break;

            case '-':  System.out.println("The difference is: " + (a - b));
            break;  

            case '*':  System.out.println("The product is: " + (a * b));
            break;

            case '/':  System.out.println("The quotient is: " + (a / b));
            break;

            case '%':  System.out.println("The remainder is: " + (a % b));
            break;
        }

       /*
        int sub = a-b;
        System.out.println("The difference is: " + sub);

        int mul = a * b;
        System.out.println("The product is: " + mul);

        int div = b / a;
        System.out.println("The quotient is: " + div);

        int mod = b % a;
        System.out.println("The remainder is: " + mod);

        int sum = a + b;
        System.out.println("The sum is: " + sum);

    */
    }
}
