public class Algorithm {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return the index where key is found
            }
        }
        return -1; // Key not found
    }
}