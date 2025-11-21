import java.util.*;

public class inputarray {
    public static void main(String args[]){
        int marks[] = new int[50]; //declaration and instantiation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 50 students:");
        //int physics;
        //phsics= sc.nextInt(); to take an input we can do this 
        // in this same way we can do it for array

        marks[0]=sc.nextInt(); //initialization
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        //marks[0] // this became a variable now we can use it like variable
        System.out.println("Marks of 3 students are:");
        System.out.println(marks[0] + " "+"1st subject marks"); //accessing array elements
        System.out.println(marks[1] +" "+ "2nd subject marks");
        System.out.println(marks[2] +" "+ "3rd subject marks");


        System.out.println(marks[0]+1); // we can do operations on array elements
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is: "+ percentage);




        int length1[]=new int[100] ;
        System.out.println("Length of array is: "+ length1.length);

        int length2 = new int[100] .length;
        System.out.println("Length of array is: "+ length2);
}
} 
 