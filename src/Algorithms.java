public class Algorithm{
     public static int linearSearch(int[] array, int target){
         for(int i=0; i<= array.length-1; i++){
             if(array[i] == target){
                 return i;
             }
         }
        return -1;
     }

     public static int binarySearch(int[] array, int target){
         int first = 0;
         int last = array.length - 1;
           while(first <= last){
            int mid = (first + last)/ 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                 first = mid + 1;
            }else{
                first =  mid - 1;
               }
         }
         return -1;
     }

}
