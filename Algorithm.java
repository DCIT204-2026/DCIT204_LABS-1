public class Algorithm {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
        // -1 is returned if our preferred element is not found
    }

   
    public static int binarySearch(int[] array, int target) {
        int low  = 0;
        int high = array.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;   // avoids integer overflow

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;   // target is in the right half
            } else {
                high = mid - 1;  // target is in the left half
            }
        }
        return -1;
    }
}
