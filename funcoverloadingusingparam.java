public class funcoverloadingusingparam {

    // func to calc  sum of 2 num
    public static int sum (int a, int b){
        return a+b; // a + b sum done here only , no need to store it in the variable   
    }

    // func to calc sum of 3 num
    public static int sum (int a , int b , int c){ // if int c removed then duplicate method error 
        return a+b+c; 
    }   

    public static void main ( String args[] ){
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
    }
}
