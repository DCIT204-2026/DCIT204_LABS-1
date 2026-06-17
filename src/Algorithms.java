public class Algorithms {
    /* ========LINEAR SEARCH========= */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    /* =====BINARY SEARCH====== */
    public static int binarySearch(int[] arr, int target) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;

        while (minIndex <= maxIndex) {
            int mid = (minIndex + maxIndex) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                minIndex = mid + 1;
            } else {
                maxIndex = mid - 1;
            }

        }
        return -1;
    }

}
