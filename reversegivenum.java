public class reversegivenum {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;

        while( num > 0 ) { // number exists
            int digit = num % 10;  // calculate last digit
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;  // update n
        }
        System.out.println("Reversed Number: " + reversedNum);
    }
}
