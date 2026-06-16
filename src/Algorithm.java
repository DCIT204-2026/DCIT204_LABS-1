public class Algorithm {

    // Linear Search: Checks every element one by one from start to finish
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            // If we find the target, return its position (index)
            if (array[i] == target) {
                return i;
            }
        }
        // If we look through everything and don't find it, return -1
        return -1;
    }

    // Binary Search: Splits the sorted array in half to find the target faster
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find the middle index

            if (array[mid] == target) {
                return mid; // Found
            }

            if (array[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Not found
    }
}
