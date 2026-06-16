import java.util.ArrayList;

public class Algorithms {
    public static int linearSearch(ArrayList<Integer> array, int target) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == target) return i;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer> array, int target) {
        int start = 0;
        int end = array.size() - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (array.get(mid) == target) {
                return mid;
            } else if (array.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}
