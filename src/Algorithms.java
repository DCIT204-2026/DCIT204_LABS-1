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

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] < target) {
                min = middle + 1;
            } 
            else {
                max = middle - 1;
            }
        }
        return -1;
    }

}