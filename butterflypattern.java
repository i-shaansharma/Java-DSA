public class butterflypattern {
    

    // 1st half starts from here 
    public static void butterfly(int n){
        //outerloop
        for (int i = 1 ; i<=n ; i++){

        //stars = i
        for (int j=1; j<=i ; j++){
            System.out.print("*");
        }
            

        //spaces = 2*n-i
        for (int j=1 ; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //spaces = i
        for (int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println(); // next line first top

        }

        // till now it was all the first half

        // do the same thing in inverted 2nd half
        
        
        for ( int i=n ; i>=1 ; i-- ){
            // after this we use the same code 
            //stars = i
        for (int j=1; j<=i ; j++){
            System.out.print("*");
        }
            

        //spaces = 2*n-i
        for (int j=1 ; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //spaces = i
        for (int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();  // next line bottom inverted

        } 


        }

        public static void main(String[] args) {
            butterfly(4);
        }
     }
 // mirror image and invert concept logical breakdown do dry run to clear the concept