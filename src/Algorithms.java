public class Algorithms {
    public class Algorithms {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static int binarySearch(int[] array, int target) {
            int start = 0;
            int end = array.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return -1;
        }
    }
}
