public class Algorithm {

    /**
     * Searches through an array element by element until the target value is found
     * or the end of the array is reached.
     *
     * @param array  the array to search through
     * @param target the value to search for
     * @return the index of the target value if found; -1 otherwise
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    /**
     * Searches for a target value in a sorted array by repeatedly dividing the
     * search space into halves.
     *
     * @param array  the sorted array to search through
     * @param target the value to search for
     * @return the index of the target value if found; -1 otherwise
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // Using low + (high - low) / 2 to prevent integer overflow
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Target found, return index
            } else if (array[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}
