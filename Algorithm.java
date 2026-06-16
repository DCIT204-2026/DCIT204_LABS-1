public class Algorithm {

    /**
     * Searches for a target value by scanning each element one by one.
     * Time complexity: O(n)
     *
     * @param array  the array to search through
     * @param target the value to find
     * @return the index of the target if found, or -1 if not found
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for a target value in a SORTED array by halving the search
     * space on each step.
     * Time complexity: O(log n)
     *
     * @param array  a sorted array to search through
     * @param target the value to find
     * @return the index of the target if found, or -1 if not found
     */
    public static int binarySearch(int[] array, int target) {
        int low  = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;   // avoids integer overflow

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;   // target is in the right half
            } else {
                high = mid - 1;  // target is in the left half
            }
        }
        return -1;
    }
}
