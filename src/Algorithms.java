public class Algorithms {

    public static int linearSearch(int[] array, int target) {
        // Loops through the length of the array
        for (int i = 0; i <= array.length; i++) {
            // checks if at that index the array is equal to the target
            if (array[i] == target) {
                return i;
            }
        }
        // if not then return -1; exit
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Continue searching while the search window is valid
        while (left <= right) {
            // Find the middle index of the array
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                // Best case scenario - If the target is the middle value return it
                return mid;
            } else if (array[mid] > target) {
                // if the middle array > left then drop the left part
                left = mid + 1;
            } else {
                // if the middle array < left then drop the right part
                right = mid - 1;
            }
        }
        return -1;
    }
}
