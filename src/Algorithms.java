public class Algorithms {

    /**
     * Performs a Linear Search on the provided array.
     * Iterates through the array elements sequentially.
     * 
     * @param array The array to search through.
     * @param target The value to search for.
     * @return The 0-based index of the target if found, or -1 if not found.
     */
    public static int linearSearch(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a Binary Search on the provided array.
     * Assumes the array is sorted in ascending order.
     * 
     * @param array The sorted array to search through.
     * @param target The value to search for.
     * @return The 0-based index of the target if found, or -1 if not found.
     */
    public static int binarySearch(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

