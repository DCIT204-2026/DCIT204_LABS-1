import java.util.Arrays;

public class Algorithm {

    // Searches the array element by element until the target is found
    // or the end of the array is reached. Works on unsorted arrays.
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found it, return the index
            }
        }
        return -1; // not found
    }

    // Searches a SORTED array by repeatedly dividing the search space in half.
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow vs (low+high)/2
            int midValue = array[mid];

            if (midValue == target) {
                return mid; // found it
            } else if (midValue < target) {
                low = mid + 1;  // search the right half
            } else {
                high = mid - 1; // search the left half
            }
        }
        return -1; // not found
    }

    // Helper to sort the array before binary search.
    // Returns a NEW sorted array so the original (e.g. for linear search) is untouched.
    public static int[] sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        return sorted;
    }
}