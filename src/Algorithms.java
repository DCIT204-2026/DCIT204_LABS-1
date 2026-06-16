public class Algorithms {

    // 1. Linear Search Implementation
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return its index position
            }
        }
        return -1; // Target not found
    }

    // 2. Binary Search Implementation
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Target found, return its index position
            } else if (array[mid] > target) {
                high = mid - 1; // Eliminate the right half
            } else {
                low = mid + 1;  // Eliminate the left half
            }
        }
        return -1; // Target not found
    }
}