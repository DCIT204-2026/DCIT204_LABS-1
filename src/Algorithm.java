public class Algorithm {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static int binarySearch(int[] arr, int target) {
        int lastindex = 0;
        int firstindex = arr.length - 1;

        while (lastindex <= firstindex) {
            int mid = lastindex + (firstindex - lastindex) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                lastindex = mid + 1; 
            } else {
                firstindex = mid - 1; 
            }
        }
        return -1; 
    }
}
