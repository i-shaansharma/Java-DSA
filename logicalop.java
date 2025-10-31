public class logicalop {
    public static void main (String args[]) {
        System.out.println( (3>2) && (2<4) ); // true && true = true
        System.out.println( (3>2) || (2>4) ); // true || false = true
        System.out.println( !(3>2) ); // !true = false
    }
}
