public class Algorithm {

    // Linear Search: checks each element one by one
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found it! return the position
            }
        }
        return -1; // never found it
    }

    // Binary Search: only works on a SORTED array
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // found it!
            } else if (array[mid] < target) {
                low = mid + 1; // target is in the right half
            } else {
                high = mid - 1; // target is in the left half
            }
        }
        return -1; // never found it
    }

}