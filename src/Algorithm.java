public class Algorithm {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // found! return the index
            }
        }
        return -1; // not found
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return mid;         // found! return the index
            } else if (array[mid] < target) {
                left = mid + 1;     // target is in the RIGHT half
            } else {
                right = mid - 1;    // target is in the LEFT half
            }
        }

        return -1; // not found
    }

}