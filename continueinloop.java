public class continueinloop {
    public static void main (String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip the iteration when i is 3 and continue to next one
            }
            System.out.println("Value of i: " + i);
        }
    }
}
