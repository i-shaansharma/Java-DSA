public class pairinarray {
        public static void printpair (int arr[]){

            int totalpairs=0 ;
            for( int i=0 ; i<arr.length ; i++){
                int current = arr[i];
                for ( int j=i+1 ; j<arr.length ; j++) {// inner loop
                        System.out.print("(" + current + "," +arr[j] + ")") ;
                        totalpairs++ ; // total pairs counts increment after each pair is printed 
                } 
                System.out.println() ; // new line after each iteration
            }
            System.out.println("Total pairs: " + totalpairs); // printing total no of pairs
        }

        public static void main (String args[]){
            int arr[]={2,4,6,8,10} ;
            printpair (arr) ; // function call from main function
        }
}
