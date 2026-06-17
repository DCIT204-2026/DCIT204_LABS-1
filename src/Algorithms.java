public class Algorithms {

    public static int linearSearch(int [] array, int target){
        for (int i = 0; i <= array.length - 1; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target){
        int begin = 0;
        int conclude = array.length -1;

        while (begin <= conclude){
            int middle = begin + (conclude - begin) / 2;

            if(array[middle] == target){
                return middle;
            }

            if(array[middle] < target){
                begin = middle + 1;
            }else {
                conclude = middle -1;
            }
        }
        return -1;
    }
}
