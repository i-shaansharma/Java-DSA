public class preandpostincdec {
    public static void main(String[] args) {
        int a = 10;
        int b = --a; // pre-decrement: a is decremented to 9, then assigned to b
        System.out.println("Value of a after pre-decrement: " + a); // prints 9
        System.out.println("Value of b after pre-decrement: " + b); // prints 9

        int x = 10;
        int y = x--; // post-decrement: y is assigned 10, then x is decremented to 9
        System.out.println("Value of x after post-decrement: " + x); // prints 9
        System.out.println("Value of y after post-decrement: " + y); // prints
    }
}
