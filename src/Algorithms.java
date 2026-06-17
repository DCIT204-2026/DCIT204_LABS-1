public class Algorithm {

    /**
     * Linear Search: Scans each element one by one until the target is found.
     * Time Complexity: O(n)
     *
     * @param array  the array to search
     * @param target the value to find
     * @return the index of the target, or -1 if not found
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Target found — return its position
            }
        }
        return -1;  // Target was not found in the array
    }

    /**
     * Binary Search: Repeatedly halves the search space to locate the target.
     * IMPORTANT: The array MUST be sorted in ascending order before calling this.
     * Time Complexity: O(log n)
     *
     * @param array  a sorted array to search
     * @param target the value to find
     * @return the index of the target, or -1 if not found
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Find the middle index

            if (array[mid] == target) {
                return mid;              // Target found at mid
            } else if (array[mid] < target) {
                low = mid + 1;           // Target is in the right half
            } else {
                high = mid - 1;          // Target is in the left half
            }
        }

        return -1;  // Target was not found in the array
    }
}
