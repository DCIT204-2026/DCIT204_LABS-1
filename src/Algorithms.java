public class Algorithms {
    // Linear search
    pulic static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.lenth; i++) {
            if (array[i] == target) {
                return i; // return value found
            } 
        }
        return -1; // not found
    }


    // binary search 
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == taarget) {
                return mid; // return value found
            }
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }
}
