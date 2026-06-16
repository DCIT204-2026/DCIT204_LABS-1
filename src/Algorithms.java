/**
 * Utility class containing common search algorithms.
 */
public class Algorithms {

    /**
     * Performs a linear search on an array.
     *
     * @param array  The array to search through.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
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
     * Performs a binary search on a sorted array.
     *
     * @param array  The sorted array to search through.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
