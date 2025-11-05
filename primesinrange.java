public class primesinrange {
     
    public static boolean isprime(int n){
     boolean isprime = true ;
    
         for ( int i = 2 ; i<=Math.sqrt(n); i++){
             if ( n % i == 0 ){
            return false;
              }
              else {
             }
            }
        return true;
        }


    public static void primeinrange(int n){
        for( int i=2 ; i<=n ; i++ ){
            if(isprime(i)){
                System.out.println(i);         // ( i + "  " ) used for space where print used in place of println
            }
        }
        System.out.println();  // printing next line 
    }
    public static void main(String args[]){
    primeinrange(10); // we didnt write system.out.println because this function is void and dont return any value so we wrote it directly to get values 
    }

 }

