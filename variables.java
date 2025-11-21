public class variables {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println(c=a+b+b);
        System.out.println("a");
        System.out.println(a);
        System.out.println("b");
        System.out.println(b);
        String ishaan="Ishaan";
        System.out.println(ishaan);

        /* changing the value of variables */
        a=30;
        System.out.println(a);
        /* changing the value of a , value of b is transferred to a*/
        a=b;
        System.out.println(a);
    }
}