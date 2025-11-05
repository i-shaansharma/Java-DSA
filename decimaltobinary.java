public class decimaltobinary {
    public static void dectobinary ( int n ){
        int input = n;
        int pow=0;
        int binary=0;

        while(n>0){
            int remainder = n % 2 ; // remainder also called last digit 
            binary = binary + (remainder * (int)Math.pow ( 10,pow)); // remainder multiplied by 10 to the power and stored in the existing binary number

            pow ++;
            n =n/2;
        }
        System.out.println("Binary form of " +  input + "is" + binary );
    }

    public static void main(String[] args) {
        dectobinary(5);
    }
}
