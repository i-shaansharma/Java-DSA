public class hollowrhombus {
    
    public static void rhombus(int n){
        for( int i=1 ; i<=n ; i++){
            for ( int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            // stars hollow rectangle logic
            for ( int j=1 ; j<=n ; j++){
                if (j==1 || j==n || i==n || i==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // next line insider the outer loop
        }
    }

    public static void main(String[] args) {
        rhombus(5);
    }
}
