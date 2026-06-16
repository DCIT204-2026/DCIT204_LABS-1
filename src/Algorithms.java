public class Algorithm {

    /**
     * Searches the array sequentially, element by element, until the
     * target value is found or the end of the array is reached.
     *
     * @param array  the array to search through
     * @param target the value being searched for
     * @return the index of the target if found, or -1 if it is not present
     */
    public static int linearSearch(int[] array, int target) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Searches a sorted array for the target value by repeatedly
     * dividing the search range in half. Requires the array to be
     * sorted in ascending order; results are undefined otherwise.
     *
     * @param array  a sorted array to search through
     * @param target the value being searched for
     * @return the index of the target if found, or -1 if it is not present
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}
