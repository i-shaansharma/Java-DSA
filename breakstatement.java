public class breakstatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break; // exit the loop when i is 3
            }
            System.out.println("Value of i: " + i);
        }
        System.out.println("Loop terminated.");
    }
}
