import java.util.Arrays;
import java.util.Scanner;

//  Main.java
//  Drives the program:
//  1. Asks the user for the array size and elements.
//  2. Asks the user for a target value to search for.
//  3. Runs Linear Search on the array exactly as the user entered it.
//  4. Runs Binary Search on a SORTED COPY of the array
//  5. Displays both results clearly.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get the arry size from the user

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Get each element from the user

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Step 3: Get the target value to search for
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        // Step 4: Linear Search
        int linearResult = Algorithms.linearSearch(arr, target);

        System.out.println("\nLinear Search result: ");
        if  (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else  {
            System.out.println("Target not found");
        }

        // Step 5: Binary Search

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int binaryResult = Algorithms.binarySearch(sortedArr, target);
        System.out.println("\nBinary Search result: ");
        System.out.println("Note: performed on a sorted copy of the array: " + Arrays.toString(sortedArr));

        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult + " in the sorted array ");

        } else   {
            System.out.println("Target not found");

        }

        sc.close();

    }
}