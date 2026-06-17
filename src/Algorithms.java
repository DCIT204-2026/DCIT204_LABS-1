public class Algorithms {
    // Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // target found, return its index
            }
        }
        return -1; // target not found
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // target found
            } else if (array[mid] < target) {
                low = mid + 1; // search the right half
            } else {
                high = mid - 1; // search the left half
            }
        }

        return -1; // target not found
    }
}
