public class linearsearch{

    public static int linearalgo(int arr[], int key){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == key){ // arr[i] is accessing each element of array one by one and its index is returned
                return i; // return index if key is found
            }
        }
        return -1; // return -1 if key is not found and it does not exist
    }
    public static void main(String args[]){
        int numbers[] = {23,45,12,67,34,89,90};
        String str[] = {"apple", "mango", "banana", "grapes"};
        int key = 34;

        int index = linearalgo(numbers, key);  // index returned here passing number array and our key   
        if (index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}