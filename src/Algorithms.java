public class Algorithms {
  
  //1. Linear Search Method
  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;               //Target was found
      }
    }
    return -1;                  //Target was NOT found
  }

  //2. Binary Search Method
  public static int binarySearch(int[] array, int target) {
      int low = 0;
      int high = array.length - 1;

      while (low <= high) {
          int mid = low + (high - low) / 2;

          //Check if the target is the middle element
          if (array[mid] == target) {
              return mid;
          }

          //Check if the the 
          //If target is greater than the middle element, ignore the left half of the array
          if (array[mid] < target) {
              low = mid + 1;
          }
          //If target is smaller than the middle element, ignore the right half of the array
          else {
              high = mid - 1; 
            }
        }

    return -1;                  //Return -1 if the target was not found
  }
}
