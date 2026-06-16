public class Algorithms {
    public static int linearSearch(int [] input, int key){
        for(int i=0;i<= input.length -1;i++){
            if(input[i]== key){
                System.out.println();
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] input, int key){
        int left = 0;
        int right = input.length -1;

        while (left <= right){
            int mid = (left + right)/2;
            if (input[mid] == key){
                return mid;
            }else if (key > input[mid]){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
