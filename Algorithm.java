import java.util.Arrays;

public class Algorithm {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] numbers, int key) {
        int start = 0;                    // ← THIS was missing
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (numbers[middle] == key) {
                return middle;
            }

            if (numbers[middle] < key) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}



