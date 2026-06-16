public class Algorithm {

    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }

    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == target) return mid;

            if (target < array[mid]) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }
}
