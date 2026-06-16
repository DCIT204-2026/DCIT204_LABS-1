public class Algorithms {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
        }
    }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (target == arr[mid]) {
            return mid;
            }   

            else if (target > arr[mid]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
