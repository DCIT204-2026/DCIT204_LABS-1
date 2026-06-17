public class Algorithms {

    public static int linearSearch(int[] numbers, int target){


        for(int i=0; i<numbers.length; i++)
            if(numbers[i] == target)
                return i;

        return -1;    
    }

    public static int binarySearch(int[] numbers, int target){

            int low = 0;
            int high = numbers.length -1;

        while (low<=high) {

            int mid = low + (high - low)/2;

            if(target == numbers[mid])
                return mid;

            if (target> numbers[mid]) 
              low = mid + 1;

            else 
                high = mid - 1;
    
            
        }
        return -1;
    }
}
