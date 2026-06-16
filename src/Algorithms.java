public class Algorithms {

    // Linear Search: check each element one by one
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return  index i if element found at index i
            }
        }
        return -1; //  If element not  found
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // element found index mid
            } else if (array[mid] < target) {
                left = mid + 1; // Search right half of the array
            } else {
                right = mid - 1; // Search left half of the array
            }
        }
        return -1; // If element is not found in the array
    }
}

