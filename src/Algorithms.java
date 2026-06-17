public class Algorithms {
    public static int linearSearch(int [] arr, int specific_value){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == specific_value){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr, int specific_value){
        int initial = 0;
        int end = arr.length-1;

        while(initial <= end){
            int mid = (initial + end)/2;

            if (arr[mid] == specific_value){
                return mid;
            } else if (arr[mid] < specific_value){
                initial = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
