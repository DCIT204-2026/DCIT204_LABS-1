class Algorithm {
    public static int insertSorted(int[] array, int count, int value) {
        int i = count - 1;
        while (i >= 0 && array[i] > value) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = value;
        return count + 1;
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
