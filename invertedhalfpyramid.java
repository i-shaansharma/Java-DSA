public class invertedhalfpyramid {
    public static void invert ( int r , int c) {
        for ( r = 1 ; r <=4 ; r ++){

            for ( c = 1 ; c <= 4-r ; c++){
                System.out.print(" ");
            }
            
            for ( c = 1 ; c<=r ; c++){
                System.out.print("*"); // dont use print ln here use print ln for next line only for space between lines
            }

            System.out.println();
        }
    }




    public static void main(String[] args) {
        int r = 1;
        int c =1 ;
        invert(r,c);
    }
}
