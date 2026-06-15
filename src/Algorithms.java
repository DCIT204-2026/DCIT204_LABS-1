public class Algorithms {
      public static int linearSearch(int[] array, int target) {
        // Your implementation here
        
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                return i;
            }
        }
        return -1;
    }

        public static int binarySearch(int[] array, int target) {
        // Your implementation here

        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(target == array[mid]){
                return mid;
            }

            else if(array[mid] < target){    
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }

        return -1; 
    }
}
