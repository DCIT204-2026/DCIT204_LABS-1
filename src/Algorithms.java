public class Algorithms {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }
        return -1;
    }

}