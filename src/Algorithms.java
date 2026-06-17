public class Algorithms {
    public static int LinearSearch(int[] array, int target){
        System.out.println("Starting Linear Search");

        for(int i = 0; i < array.length; i++) {
            System.out.println("Check index" + i + "value" + array[i]);

            if(array[i] == target) {
                System.out.println("Match is Found" );
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] array, int target) {
        System.out.println("Starting Binary Search");

        int low = 0;
        int high = array.length - 1;
        int step = 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                System.out.println("Match is Found");
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
                System.out.println("Target is larger.Move"+low);
            } else if (array[mid] > target) {
                high = mid - 1;
                System.out.println("Target is smaller.Move"+high);
            } else {
                step++;
            }
        }
        return -1;
    }

}
