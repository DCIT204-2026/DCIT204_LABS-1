public class Algorithms {

    
    public static int linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                return i;
            }

        }

        return -1;
    }

   
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int middle = (low + high) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (target < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }
}