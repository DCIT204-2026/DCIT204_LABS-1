public class Algorithms {

    public class LinearSearch {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
    }

    public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (a}r[mid] < target) {
                high = mid + 1;
            } else {
                low = mid - 1 ;
        }
        return -1;
    }
    }
}
