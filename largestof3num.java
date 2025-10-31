public class largestof3num {
    public static void main(String[] args) {
     int a = 1 ;
     int b = 3 ;
     int c = 6 ;   
     if ( a==b && b==c){
        System.out.println("all are equal");
     }
     
     else if (a>b && a >c){
        System.out.println("a is largest   "+ a);
     }
     else if (b>a && b>c){
        System.out.println("b is largest  "+b);
     }
     else{
        System.out.println("c is largest  " + c);
    }
    
    }
}
