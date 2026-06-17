import java.util.Arrays;

public class Algorithms {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i
                  }
        }
        return -1; 
    }
    public static int binarySearch(int[] array, int target) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted); 
        int left = 0;
        int right = sorted.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sorted[mid] == target) {
                return mid; 
            } else if (sorted[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}
