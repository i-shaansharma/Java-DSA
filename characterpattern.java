public class characterpattern {
    public static void main(String[] args) {

        char ch = 'A'; // initialize character ch to 'A'
        int n =4 ; // number of lines to print

        for (int line = 1; line <= n; line++) {
/*cant use char here reserved keyword */  for (int charCount = 1; charCount <= line; charCount++) {
                System.out.print(ch); // print the current character\
                 ch++; // move to the next character in the alphabet
            }
            System.out.println(); // move to the next line after printing characters in the current line
        }
    }
}
