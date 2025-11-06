public class floydtriangle {
    
    public static void floyd(int n) { // this n signify total no of lines to print
      int counter = 1;
        for( int r = 1 ; r<=n ; r ++){
            for ( int c = 1 ; c <= r ; c ++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }

        
    }


    public static void main(String[] args) {
        int n = 5;
        floyd(n);

    }
}
