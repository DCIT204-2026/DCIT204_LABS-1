public class Algorithms {

    public static int linearSearch(int[] array, int goal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == goal) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int goal) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == goal) {
                return mid;
            }
            else if (array[mid] < goal) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
