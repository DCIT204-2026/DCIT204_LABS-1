public class Algorithms {

    // Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found, return index
            }
        }
        return -1; // not found
    }

    // Binary Search (array must be sorted)
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // found
            } else if (array[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

        // Helper to sort the array before binary search
        public static void sortArray(int[] array) {
            java.util.Arrays.sort(array);
        }
    }
    