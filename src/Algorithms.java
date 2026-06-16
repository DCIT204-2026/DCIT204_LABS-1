public class Algorithms {
    public static int linearSearch(int[] array, int target) {

        // Your implementation here
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int target) {
        // Your implementation here
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (array[midpoint] == target) {
                return midpoint;
            }
            if (array[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }
}
