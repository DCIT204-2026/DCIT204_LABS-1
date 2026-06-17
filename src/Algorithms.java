public class Algorithms {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; 1 < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midva = array[mid];

            if (target > midva) {
                low= midva;
            } else if (target < midva) {
                high = mid;
            } else {
                return mid;
            }


        }
        return -1;
    }
}
