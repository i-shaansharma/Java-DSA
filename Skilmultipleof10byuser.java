import java.util.*;

public class Skilmultipleof10byuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // infinite loop
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            } else {
                System.out.println("The number " + n + " is not a multiple of 10. Continuing...");
            }
        }
    }
}
