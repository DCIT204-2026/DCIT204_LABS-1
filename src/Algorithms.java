public class Algorithms {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
          if (array[i] == target) {
              return i;
          }
        }
        return -1;
    }


    public static int binarySearch(int[] array, int target) {
        int startIndex = 0;
        int endIndex = array.length -1;

        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if (array[midIndex] == target) {
                return midIndex;
            }
            else if (array[midIndex] < target) {
                startIndex = midIndex + 1;
            }
            else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}