public class Algorithm {

    /**
     * Performs a Linear Search on the array.
     * Searches element by element until the target is found or end of array is reached.
     * 
     * @param array The array to search
     * @param target The target value
     * @return The 0-based index of the target if found, otherwise -1
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }

    /**
     * Performs a Binary Search on a sorted array.
     * Repeatedly divides the search space in half.
     * 
     * @param array The sorted array to search
     * @param target The target value
     * @return The 0-based index of the target in the sorted array if found, otherwise -1
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids integer overflow

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
