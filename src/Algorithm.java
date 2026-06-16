public class Algorithm {

    // 1. Linear Search Implementation
    // This looks through the array item by item from start to finish
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found the target, return its position (index)
            }
        }
        return -1; // Went through the whole array and didn't find it
    }

    // 2. Binary Search Implementation
    // This repeatedly divides a SORTED array in half to find the target quickly
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Found the target!
            }
            if (array[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Target is not in the array
    }
}