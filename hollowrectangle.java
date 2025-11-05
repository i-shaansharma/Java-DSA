public class hollowrectangle {
    public static void hrec( int r , int c ){
       for( r = 1 ; r <=4 ; r ++){
            for (c=1 ; c <=5 ; c++){
                if(r==1 || c==1 || r==4 ||c==5 ){
                    System.out.print("*");
                     }
                else {
                    System.out.print(" ");
                }
            }
 System.out.println(); // empty space
        }

    }

    public static void main(String[] args) {
        int r = 1;
        int c = 1;
        hrec(r,c);
    }
}
