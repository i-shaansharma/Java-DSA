public class invertedhalfpyramidwithnumber {
    
    public static void halfpyramid( int r , int c) {
        for ( r=1 ; r <= 5 ; r ++){
            for ( c = 1 ; c <=  5-r+1 ; c ++){
        System.out.print(c);

        }
System.out.println();
    }

}

    public static void main (String args[]){
        int r =1 ;
        int c =1 ;
                halfpyramid(r, c);
            }
}

