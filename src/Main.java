import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       //linear search

        Scanner input = new Scanner(System.in);

        // read array arraySize and initialize array

        System.out.print("Enter array arraySize: ");
        int arraySize = input.nextInt();

        int[] arr = new int[arraySize];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arraySize; i++) {
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
        //binary search

        // Sort array before binary search
        Arrays.sort(arr);

        /*
         divides the array into halves to search faster.
         */

        int binResult = Algorithms.binSearch(arr, target);

        System.out.println("\nBINARY SEARCH RESULT");

        if (binResult != -1) {
            System.out.println("Target found at index: " + binResult);
        } else {
            System.out.println("Target NOT FOUND");
        }
        input.close();
    }

}