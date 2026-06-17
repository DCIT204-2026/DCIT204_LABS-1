public class Algorithms {
    // 1. linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Target not found
    }

    // 2. binary search 
    public static int binarySearch(int[] arr, int target) {
          int left = 0;
          int right = arr.length - 1;
    
          while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] == target) {
                 return mid; // Target found, return its index
                } else if (arr[mid] < target) {
                 left = mid + 1; // Search in the right half
                } else {
                 right = mid - 1; // Search in the left half
                }
          }
          return -1; // Target not found
     }
}