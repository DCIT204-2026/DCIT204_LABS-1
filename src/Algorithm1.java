import java.util.Arrays;

public class Algorithm1{
    public static int linearSearch(int[] array, int target) {
        int index = 0;
        int length = array.length;
        while (index < length) {
            if (array[index] == target) {
                return index;
            }
            index += 1;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int[] arrayInUse = Arrays.copyOf(array, array.length);

        Arrays.sort(arrayInUse);

        while (start < end) {
            int middle = (start + end) / 2;
            if (target == arrayInUse[middle]) {
                return middle;
            }
            else if (target > arrayInUse[middle]) {
                start = middle + 1;
            }
            else {
                end = middle;
            }
        }
        return -1;
    }
}