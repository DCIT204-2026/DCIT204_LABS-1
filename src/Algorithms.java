public class Algorithms {

    // Linear Search method
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) {
                return i; // return index if found
            }
        }

        return -1; // target not found
    }


    // Binary Search method
    // Array must be sorted before using this method
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;


        while (left <= right) {

            int middle = (left + right) / 2;


            if (array[middle] == target) {
                return middle; // found
            }


            if (array[middle] < target) {
                left = middle + 1; // search right half
            }

            else {
                right = middle - 1; // search left half
            }
        }


        return -1; // not found
    }
}
