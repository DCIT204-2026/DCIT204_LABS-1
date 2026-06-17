public class Algorithms {

    public static int linearSearch(int[] array, int targetValue) {
        for(int i = 0; i<= array.length-1; i++){
            if(array[i] == targetValue){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []array, int target){
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
