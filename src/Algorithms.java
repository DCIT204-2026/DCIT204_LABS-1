public class Algorithms {

    // Linear Search
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) {
                return i; // return index if found
            }
        }

        return -1; // target not found
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return mid; // target found
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }
}