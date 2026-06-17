public class Algorithm {

    /**
     * Loops through the array sequentially to find the target.
     * 
     * @return index of target if found, otherwise -1
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
     * Divides the search space in half repeatedly. Assumes array is sorted.
     * 
     * @return index of target if found, otherwise -1
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow

            if (array[mid] == target) {
                return mid; // Target found
            } else if (array[mid] < target) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }
        return -1; // Target not found
    }
}