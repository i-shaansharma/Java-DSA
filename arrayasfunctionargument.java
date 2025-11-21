import java.util.*;

public class arrayasfunctionargument {
    public static void update(int marks[], int nonchangeable){
        nonchangeable=10;
        for (int i=0; i<marks.length; i++){ // i is index of our array
            marks[i] = marks[i] + 1;
        }
 // marks getting updated with the help of call by reference
    }
public static void main(String args[]){
    int marks[] = {97,98,99};
    int nonchangeable=5;
    update(marks , nonchangeable);// update function  // here we are callin a function
// we used call by reference here otherwise update dont work here
    System.out.println(nonchangeable); // for non changeable variable value remains same 


    // for printing marks

    for (int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
    }
    System.out.println(); // new line
}
}