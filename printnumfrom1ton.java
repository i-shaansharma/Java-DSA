import java.util.*;

public class printnumfrom1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int counter = 1;

        while (counter <= number) {
            System.out.print(counter + " "); // + " " gives extra space
            counter++;
        }
    }
}
