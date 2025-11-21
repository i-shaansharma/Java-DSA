import java.util.*;

public class largestinarray{
    public static int largestnum(int numbers[]){ // get larghest number and then return it into main function   
        int largest = Integer.MIN_VALUE ; // SIGNIFY - INFINITY SMALLEST INTEGER VALUE NUMBER LOWEST POSSIBLE VALUE IN INTEGER
        int smallest = Integer.MAX_VALUE ; // SIGNIFY + INFINITY LARGEST INTEGER VALUE NUMBER HIGHEST POSSIBLE VALUE IN INTEGER
        // NOW RUN A LOOP TO CHECK EACH ELEMENT
        for (int i=0; i<numbers.length; i++){ // numbers.length gives length of array
            if (largest < numbers[i]){ // compare each element with largest if largest is less than number at ith position then we update the number
                largest = numbers[i]; // update largest if current element is greater largest updated to number at ith position
            }
            if (smallest > numbers[i]){ // compare each element with smallest if smallest is greater than number at ith position then we update the number
                smallest = numbers[i]; // update smallest if current element is smaller smallest updated to number at ith position
            }
        }
        System.out.println("Smallest number is: " + smallest); // print the smallest number
        return largest;
    } 
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,10,8,9}; // array declaration and initialization
        System.out.println("Largest number is: " + largestnum(numbers)); // call the function and print the largest number
        
    }
    
}