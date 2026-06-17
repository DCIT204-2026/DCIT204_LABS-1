public class Algorithms {
 /**
     * Performs a Linear Search on the array.
     * Time Complexity: O(n)
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return current index
            }
        }
        return -1; // Target not found
    }

    /**
     * Performs a Binary Search on a sorted array.
     * Time Complexity: O(log n)
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow

            if (array[mid] == target) {
                return mid; // Target found
            } else if (array[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Target not found
    }

}

