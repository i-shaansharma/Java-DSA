import java.util.*;

public class subarray {
    public static void printsubarray(int arr[]) {

        int totalsubarrays=0;
        for (int i = 0; i < arr.length; i++) { // starting point of subarray
            int start = i; // current element will be the start element 
            for (int j = i; j < arr.length; j++) { // ending point of subarray
                int end = j;
                // print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " "); // printing elements of subarray
                }
                totalsubarrays++;
                System.out.println(); // new line after each subarray

            } System.out.println(); // new line after each subarray
        }   

        System.out.println("Total subarrays: " + totalsubarrays); // printing total no of subarrays
    }

        public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        printsubarray(arr); // function call from main function
    }
}