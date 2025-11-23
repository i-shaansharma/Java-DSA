public class maxsubarraysum {
    public static void maxcurrsum(int numbers[]){
        int currsum=0;
        int maxsubarraysum = Integer.MIN_VALUE;


        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                currsum=0;
                int end = j;
                for (int k=i; k<=j; k++){
                  // not this because we dont need to print the sub array   System.out.print(numbers[k] + " ");
                  currsum = currsum + numbers[k];
                }
                System.out.println(currsum);
                if (maxsubarraysum < currsum){
                    maxsubarraysum = currsum;
                }
            }
    }
        System.out.println("Maximum sub array sum is: " + maxsubarraysum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxcurrsum(numbers); 
    }
}
