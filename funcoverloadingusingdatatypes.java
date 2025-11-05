public class funcoverloadingusingdatatypes {
    public static int sum(int a , int b ){
        return a+b;
    }
    public static float sum(float a, float b){   // return type should be float
        return (a+b);
    }

    public static void main (String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3.5f,1.5f));
    }
}
