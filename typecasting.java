import java.util.*;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int)a; // explicit typecasting
        System.out.println(b);


        char ch ='a';
        int num = ch; // implicit typecasting
        System.out.println(num);
    }
}
