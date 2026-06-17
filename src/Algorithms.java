public class Algorithms {
    //Linear Search
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; //found at this index
            }
        }
        return -1;//target not found
    }

    //Binary Search
    public static int BinarySearch(int[] array, int target) {
        int low = 0;
        int high= array.length - 1;

        while (low<=high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            if (value == target) {
                return middle;
            } else if (value < target) {
                low = middle + 1;
            }  else {
                  high = middle - 1;
                }
            }
            return -1; //target not found
        }
    }
