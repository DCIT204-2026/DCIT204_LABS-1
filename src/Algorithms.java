public class Algorithms {
  public static int linearSearch(int[] array, int value){
    for(int i = 0; i < array.length; i++){
      if(array[i] == value){
        return i;
      }

    }

    return -1;

  }


  // algorithm for binary search
  public static int binarySearch(int[] array, int value){
    int left = 0;
    int right = array.length - 1;
    while (left <= right){
      int mid = (left + right) / 2;
      if (array[mid] == value){
        return mid;
      } else if (array[mid] < value){
        left = mid + 1;
      } else {
        right = mid - 1;  
      }
    }
    return -1;
  }
}
