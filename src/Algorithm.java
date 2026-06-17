public class Algorithm {

    /**
     * Linear Search
     *
     * Scans the array from index 0 to the last index.
     * Returns the index of the first occurrence of the target,
     * or -1 if the target is not present.
     *
     * Time complexity: O(n)
     * Works on unsorted and sorted arrays.
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;   // target found – return its position
            }
        }
        return -1;          // target was not found
    }

    /**
     * Binary Search
     *
     * Requires the array to be SORTED in ascending order.
     * Repeatedly halves the search space:
     *   - If the middle element equals the target  → return its index.
     *   - If the middle element is less than target → search the right half.
     *   - If the middle element is greater          → search the left half.
     *
     * Time complexity: O(log n)
     */
    public static int binarySearch(int[] array, int target) {
        int left  = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Use this formula to avoid integer overflow
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;          // target found at mid
            } else if (array[mid] < target) {
                left = mid + 1;      // target is in the right half
            } else {
                right = mid - 1;     // target is in the left half
            }
        }

        return -1;                   // target was not found
    }
}

