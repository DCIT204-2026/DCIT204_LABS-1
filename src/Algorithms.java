import java.util.ArrayList;
public class Algorithms {
    public static int linearSearch(ArrayList<Integer> arr, int target){
        int n = arr.size();
        for(int i = 0; i < n; i++){
            if (arr.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer>arr, int target ){
        int n = arr.size();
        System.out.println("Sorted Array: " + arr.toString());
        int low =0;
        int high = n-1;

        while (low <=high){
            int mid = low + (high-low) / 2;
            if(arr.get(mid) == target){
                return mid;
            }
            else if (arr.get(mid) < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
