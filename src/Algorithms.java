public class Algorithms {

    // Linear Search implementation 
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) { // go through each element
            if (array[i] == target) {
                return i; // found it, return the index
            }
        }
        return -1; // not in the array
    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // find the middle

            if (array[mid] == target) {
                return mid; // found it
            } else if (array[mid] < target) {
                left = mid + 1; // go right
            } else {
                right = mid - 1; // go left
            }
        }

        return -1; // not in the array
    }


}
