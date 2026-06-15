public class Algorithm {

    // Linear Search Method
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return index if found
            }
        }

        return -1; // return -1 if not found
    }

    // Binary Search Method
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle; // target found
            }

            else if (array[middle] < target) {
                left = middle + 1;
            }

            else {
                right = middle - 1;
            }
        }

        return -1; // target not found
    }
}
