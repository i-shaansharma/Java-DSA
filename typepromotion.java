public class typepromotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println(a); // prints character 'a'
        System.out.println(b); // prints character 'b'
        System.out.println((int)a); // implicit type promotion to int
        System.out.println((int)b); // implicit type promotion to int
        System.out.println(b-a); // implicit type promotion to int
        System.out.println((a-b)); // explicit type casting back to char
// statement 1
        short a1 = 10;
        byte b1 = 20;
        char c1 = 'a';
        byte d = (byte)(a1 + b1 + c1); // explicit type casting
        System.out.println(d);

// statment 2
        int x = 1000;
        float y = 80.85f; 
        long z = 50000L;
        double w = 0.1234;
        double result = x + y + z + w; // implicit type promotion to double
        System.out.println(result);
    }
}
