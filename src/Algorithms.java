import java.util.Arrays;
import java.util.Comparator;

public class Algorithm {

    /**
     * Performs a linear search on the array.
     * @param arr The original array
     * @param target The value to search for
     * @return The index of the target if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return original index
            }
        }
        return -1; // Element not found
    }

    /**
     * Performs a binary search on the array after sorting it.
     * Prints the sorted array and the sorted index before returning the original index.
     * @param arr The original array
     * @param target The value to search for
     * @return The original index of the target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        // Create a 2D array to track [value, originalIndex]
        int[][] pairedArray = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            pairedArray[i][0] = arr[i];       // The actual value
            pairedArray[i][1] = i;            // The original index
        }

        // Sort the paired array based on the values (column 0)
        Arrays.sort(pairedArray, Comparator.comparingInt(a -> a[0]));

        // --- NEW: Print the sorted array to the user ---
        System.out.print("Sorted Array: [");
        for (int i = 0; i < pairedArray.length; i++) {
            System.out.print(pairedArray[i][0]);
            if (i < pairedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // -----------------------------------------------

        // Perform Binary Search on the sorted paired array
        int low = 0;
        int high = pairedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (pairedArray[mid][0] == target) {
                // --- NEW: Print the index position in the sorted array first ---
                System.out.println("Target " + target + " found at sorted index: " + mid);

                return pairedArray[mid][1]; // Return the tracked original index
            } else if (pairedArray[mid][0] < target) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }

        // If the loop finishes without finding the target
        System.out.println("Target " + target + " was not found in the sorted array.");
        return -1;
    }
}