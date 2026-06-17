import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * =====Read the size of the array from the user, then initialize the array
         * and populate it with user-provided elements====
         */

        /* =========linear search implementation========== */

        Scanner input = new Scanner(System.in);

        // read array size and initialize array

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter Target value: ");
        int target = input.nextInt();

        int result = Algorithms.linearSearch(arr, target);

        System.out.println("\n LINEAR SEARCH RESULT");

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {

            System.out.println("Target NOT FOUND");
        }
        /* ======== binary search implementation ========== */

        // Sort array before binary search
        Arrays.sort(arr);

        /*
         * =========================================================
         * STEP 7: PERFORM BINARY SEARCH (SORTED ARRAY)
         * =========================================================
         * Binary search divides the array into halves to search faster.
         */

        int binarySearchResult = Algorithms.binarySearch(arr, target);

        System.out.println("\nBINARY SEARCH RESULT");

        if (binarySearchResult != -1) {
            System.out.println("Target found at index: " + binarySearchResult);
        } else {
            System.out.println("Target NOT FOUND");
        }
        input.close();
    }

}