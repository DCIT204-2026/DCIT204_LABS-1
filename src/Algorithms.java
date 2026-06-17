import java.util.Arrays;

public class Algorithms {

    // LINEAR SEARCH
    // Goes through the array one by one from the start
    // Returns the index where the target is found, or -1 if not found
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found it! return the position
            }
        }
        return -1; // went through everything, not found
    }

    // BINARY SEARCH
    // Only works on a SORTED array
    // Keeps cutting the search area in half until it finds the target
    // Returns the index where the target is found, or -1 if not found
    public static int binarySearch(int[] array, int target) {
        // Sort the array first so binary search works correctly
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        int low = 0;
        int high = sorted.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // find the middle index

            if (sorted[mid] == target) {
                return mid; // found it at the middle!
            } else if (sorted[mid] < target) {
                low = mid + 1; // target is in the right half
            } else {
                high = mid - 1; // target is in the left half
            }
        }

        return -1; // not found
    }

}
