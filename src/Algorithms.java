//         Algorithm.java
//     Contains implementations of two classic searching algorithms:
//     1. Linear Search  - O(n) time, works on ANY array (sorted or not)
//     2. Binary Search  - O(log n) time, only works correctly on a SORTED array

public class Algorithms {

    // Linear Search Method

    public static int linearSearch(int[] arr, int target){

       // Let's walk through every position in the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        // If we finish the loop without returning, the target is not present then..
        return -1;
    }





// Binary Search Method

    public static int binarySearch(int[] arr, int target) {
        int low = 0;                // Start of the current search range
        int high = arr.length - 1;   // end of the current search range

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        // low > high means the searh range is empty - target not present
        return -1;

    }
}
