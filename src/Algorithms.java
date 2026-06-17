public class Algorithms {
    public static int linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int lower = 0;
        int upper = array.length -1;

        while (lower <= upper){
            int mid = lower + (upper-lower)/2;
            
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return -1;
    }
}