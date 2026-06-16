public class Algorithms {
    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(key == a[mid]){
                return mid;
            }
            else if(key < a[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
}
}