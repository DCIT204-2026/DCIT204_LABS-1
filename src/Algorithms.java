public class Algorithms {
    public static int linearsearch(int [] arr , int target){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == target) {
                return i;

            }

        }
        return -1;

    }
    public static int binarysearch(int []arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target ){
                start = mid + 1;
            }
            else{
                end = mid + 1;
            }
        }
        return -1;
    }
}

