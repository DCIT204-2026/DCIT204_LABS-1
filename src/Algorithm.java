import java.lang.reflect.Array;
import java.util.Arrays;

public class Algorithm {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}