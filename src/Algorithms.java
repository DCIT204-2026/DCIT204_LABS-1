public class Algorithms {
    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;


        while (start <= end){
            int mid = start + (end - start) / 2;

            if (array[mid] == target){
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}