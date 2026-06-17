public class Algorithms {
     public static int linearSearch(int[] array, int target) {
        

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }

   

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Helper to validate no negative values in the array or target
    private static void validateNonNegative(int[] arr, int target) {
        for (int v : arr) {
            if (v < 0) {
                throw new IllegalArgumentException("Array contains negative value: " + v);
            }
        }
        if (target < 0) {
            throw new IllegalArgumentException("Target value must be non-negative.");
        }
    }
}

