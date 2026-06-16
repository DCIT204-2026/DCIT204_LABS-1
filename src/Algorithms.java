public class Algorithms {
//    linear search algorithm
    public static int linearSearch ( int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

//    binary search algorithm
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int rigth = arr.length - 1;

        while (left <= rigth){
            int mid = left + (rigth - left)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                left = mid + 1;
            }else{
                rigth = mid - 1;
            }
        }
        return -1;
    }


}
