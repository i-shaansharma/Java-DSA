public class zeroonetriangle {
    
    public static void triangle (int n){
        for ( int r = 1 ; r<=n ; r++){
            for ( int c = 1 ; c <=r ; c++ ){
                if ( (r+c)%2 ==0 ){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
