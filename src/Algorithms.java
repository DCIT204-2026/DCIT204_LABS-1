public class Algorithm {

    /**
     * Linear Search: checks each element one by one until target is found.
     * @param array the array to search
     * @param target the value to find
     * @return index of target if found, -1 otherwise
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
     * Binary Search: repeatedly halves the search space on a sorted array.
     * @param array a SORTED array to search
     * @param target the value to find
     * @return index of target if found, -1 otherwise
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}