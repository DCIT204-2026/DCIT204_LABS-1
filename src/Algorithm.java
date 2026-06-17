public class Algorithm {

    // Linear Search: checks each element one by one
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }

    // Binary Search: works only on sorted arrays
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // found at index mid
            }
            else if (array[mid] < target) {
                left = mid + 1; // search right half
            }
            else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
}