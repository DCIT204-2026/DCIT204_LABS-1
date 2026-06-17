public class Algorithms {

    // Linear Search
    public static int findLinear(int[] data, int key) {

        for (int pos = 0; pos < data.length; pos++) {

            if (data[pos] == key) {
                return pos;
            }

        }

        return -1;
    }

    // Binary Search
    public static int findBinary(int[] data, int key) {

        int start = 0;
        int end = data.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (data[middle] == key) {
                return middle;
            }

            if (data[middle] < key) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}