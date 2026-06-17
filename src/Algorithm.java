public class Algorithm {
    
    // Linear Search - checks each element one by one
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Found it! Return the position
            }
        }
        return -1;  // Not found
    }
    
    // Binary Search - splits the array in half each time
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return mid;  // Found it!
            } else if (array[mid] < target) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }
        return -1;  // Not found
    }
}