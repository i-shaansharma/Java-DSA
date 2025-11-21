public class binaryseach {
    public static int binarysearchalgo(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end){ // start == end when we have single element and its our start as well as end too
            int mid = start + (end - start) / 2; // to avoid overflow 

            if (numbers[mid] == key){
                return mid; // key found at mid index
            }
            if (numbers[mid] < key){
                start = mid + 1; // search in right half // updating start of 2nd half
            } else {
                end = mid - 1; // search in left half // updating end of 1st half
            }
        }
        return -1; // key not found
    }
    public static void main(String args[]){
        
        int numbers[] = {2,4,6,8,10,12,14,16,18,20}; // sorted array
        int key = 14;
        System.out.println("Key found at index: " + binarysearchalgo(numbers, key)); // calling binary search function and printing index
    }
}
