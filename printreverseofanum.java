public class printreverseofanum {
    public static void main(String[] args) {
        int num = 10899;
       // int reversedNum = 0;

        while( num>0 ) { // number exists
            int digit = num % 10;
            System.out.print(digit + " "); // last digit with spaces + ""
          //  reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        System.out.println(); // for new line after loop
    }
}
