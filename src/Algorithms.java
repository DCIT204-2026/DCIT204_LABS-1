public class Algorithms {
    
    //Linear Search Algorithm
    public static int linearSearch(int[] num_arr, int searchKey) {
        for (int i = 0; i < num_arr.length; i++) {
            if (num_arr[i] == searchKey) {
                return i; // Return the index of the target
            }
        }
        return -1; // Target number not found
    }

    //Binary Search Algorithm (requires sorted array)
    public static int binarySearch(int[] num_arr, int searchKey) {
        int lower = 0;
        int upper = num_arr.length - 1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (num_arr[mid] == searchKey) {
                return mid; // Return the index of the searchKey
            } else if (num_arr[mid] < searchKey) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return -1; // Target number not found
    }
}
