public class Algorithms {

    public static int linearSearch(int[] array, int target){
        // Loop through array from start to end
        // Compare each element with target
        // Return index if found, -1 if not found
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i; // Found at index i
            }

        }
        return -1; // Not found

    }

    public static int binarySearch(int[] array, int target){
        // Use two pointers: left and right
        // Find middle, compare with target
        // Adjust left/right based on comparison
        // Return index if found, -1 if not found
        int left = 0;
        int right = array.length - 1;

        while (left < right){
            int mid = left + (right - left) / 2; // Find middle

            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target){
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half

            }
        }
        return -1;

    }
}
