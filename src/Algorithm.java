public class Algorithm {

    /**
     * Performing a Linear Search on the array.
     * Time Complexity: O(n)
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
     * Performing a Binary Search on a sorted array.
     * Time Complexity: O(log n)
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
