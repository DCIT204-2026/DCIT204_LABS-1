public class Algorithms {

    // Linear Search: checks each element one by one until target is found
    public static int linearSearch(int[] array, int target) {
        if (array == null) return -1; // safety check for empty/null array

        for (int i = 0; i < array.length; i++) { // go through every index
            if (array[i] == target) return i; // match found, return its position
        }

        return -1; // went through whole array, target not found
    }

    
    // Binary Search: only works on a SORTED array
    // Repeatedly checks the middle element and narrows the search range
    public static int binarySearch(int[] array, int target) {
        if (array == null) return -1;  // safety check for empty/null array

        int low = 0;                  // start of search range
        int high = array.length - 1;  // end of search range

        while (low <= high) {
            int mid = low + (high - low) / 2; // middle index of current range

            if (array[mid] == target) {
                return mid; // found it
            } else if (array[mid] < target) {
                low = mid + 1; // target is in the right half, move low up
            } else {
                high = mid - 1; // target is in the left half, move high down
            }
        }

        return -1; // range shrank to nothing, target not in array
    }

}

