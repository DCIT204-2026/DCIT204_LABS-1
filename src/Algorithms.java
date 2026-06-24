public class Algorithms {

    // Linear Search - implemented for unsorted arrays.
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search - implemented for sorted arrays.
    public static int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;    //obtains the middle index.

            if (arr[mid] == target) {      //obtains the middle index as the target if equal.
                return mid;        
            } else if (arr[mid] < target) {
                low = mid + 1;            //obtains the value from the middle index to the end of the array (searches the right-half of the array).
            } else {
                high = mid - 1;          //obtains the value from the middle index to the start of the array (searches the left-half of the array).
            }                            
        }
        return -1;                       //displays -1 if not found in the array.
    }

}

