import java.util.Arrays;

public class Algorithm{
    public static int linearSearch(int[] list, int target) {
        int ind = 0;
        int length = list.length;
        while (ind < length) {
            if (list[ind] == target) {
                return ind;
            }
            ind += 1;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length;

        Arrays.sort(list);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == list[mid]) {
                return mid;
            }
            else if (target > list[mid]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return -1;
    }
}