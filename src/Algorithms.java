public class Algorithms {

    public static int linearSearch(int n, int[] array, int target) {
        for (int i = 0; i < n; i++) {
            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int n, int[] array, int target) {
        int start = 0;
        int end = n-1;

        if(array[start] == target){
            return start;
        }else if(array[end] == target){
            return end;
        }

        while(start != end){
            int mid = (int) Math.floor((end - start) / 2);

            if(array[mid] > target){
                end = mid - 1;
            }else if(array[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
