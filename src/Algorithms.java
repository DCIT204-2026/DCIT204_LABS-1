public class Algorithms {
    public class Algorithm {

        // LINEAR SEARCH
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // found
                }
            }
            return -1; // not found
        }

        // BINARY SEARCH (array MUST be sorted)
        public static int binarySearch(int[] array, int target) {

            int left = 0;
            int right = array.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // found
                }

                // search left side
                if (array[mid] > target) {
                    right = mid - 1;
                }
                // search right side
                else {
                    left = mid + 1;
                }
            }

            return -1; // not found
        }
    }
}
