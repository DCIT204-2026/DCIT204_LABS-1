public class Algorithm {

    // Linear Search Method
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found
            }
        }

        return -1; // Target not found
    }

    // Binary Search Method
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return mid; // Target found
            }

            if (array[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }
}
