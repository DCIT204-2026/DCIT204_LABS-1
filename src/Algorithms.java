public class Algorithm {

    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {

            if (target == array[i]) {
                return i;
            }

        }

        return -1;
    }

    public static boolean ascend(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }

        }

        return true;
    }

    public static int findMiddle(int first, int last) {

        return (first + last) / 2;
    }

    public static int binarySearch(int[] array, int target) {

        int first = 0;
        int last = array.length - 1;
        int mid;

        if (ascend(array)) {

            while (first <= last) {

                mid = findMiddle(first, last);

                if (target == array[mid]) {

                    return mid;

                } else if (target < array[mid]) {

                    last = mid - 1;

                } else {

                    first = mid + 1;

                }

            }

        } else {

            while (first <= last) {

                mid = findMiddle(first, last);

                if (target == array[mid]) {

                    return mid;

                } else if (target > array[mid]) {

                    last = mid - 1;

                } else {

                    first = mid + 1;

                }

            }

        }

        return -1;
    }
}
