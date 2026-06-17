public class Algorithm {

    // LINEAR SEARCH
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Found! Return the index
            }
        }
        return -1;  // Not found
    }

    // BINARY SEARCH
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;       // Found! Return the index
            } else if (array[mid] < target) {
                left = mid + 1;   // Search right half
            } else {
                right = mid - 1;  // Search left half
            }
        }
        return -1;  // Not found
    }

}