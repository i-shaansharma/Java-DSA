public class callbyvalueswap {

    public static void swap(int a, int b){
        int temp = a; // temp = 5
        a = b;        // a = 10
        b = temp;     // b = 5

        
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        int a = 5; 
        int b = 10;
        // a value in b and b value in a

        //swap
        swap(a, b); // call by value swap function

    }
}
