public class Algorithms {

    /**
     * Linear Search - searches element by element
     * Time Complexity: O(n)
     * @param array - the array to search
     * @param target - the value to find
     * @return index of target if found, -1 if not found
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
     * Binary Search - divides search space in half each time
     * Time Complexity: O(log n)
     * NOTE: Array must be sorted before calling this method
     * @param array - the SORTED array to search
     * @param target - the value to find
     * @return index of target if found, -1 if not found
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find middle index

            if (array[mid] == target) {
                return mid; // Target found at middle
            } else if (array[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

}
