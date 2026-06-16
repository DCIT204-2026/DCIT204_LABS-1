import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Enter target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(arr, target);

        System.out.println("\n--- Linear Search Result ---");
        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Sort array before Binary Search
        Arrays.sort(arr);

        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        // Binary Search
        int binaryResult = Algorithm.binarySearch(arr, target);

        System.out.println("\n--- Binary Search Result ---");
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        input.close();
    }
}