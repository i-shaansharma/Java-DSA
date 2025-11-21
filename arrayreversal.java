import java.util.*;

public class arrayreversal {
    public static void reverseArray(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            // Swap numbers[first] and numbers[last]
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            // this is classical code for swapping two numbers using third variable temp
            // Move towards middle
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(); // new line
        }
    }
