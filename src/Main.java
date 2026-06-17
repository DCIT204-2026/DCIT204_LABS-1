import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine().trim());

        // Get the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array, one at a time:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        // Get the target value to search for
        System.out.print("Enter the target value to search for: ");
        int target = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("\nOriginal array: " + Arrays.toString(arr));

        // Perform Linear Search
        int linearResult = Algorithms.linearSearch(arr, target);
        System.out.println("\n--- Linear Search ---");
        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Binary Search requires a sorted array
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println("\nSorted array (for Binary Search): " + Arrays.toString(sortedArr));

        // Perform Binary Search
        int binaryResult = Algorithms.binarySearch(sortedArr, target);
        System.out.println("\n--- Binary Search ---");
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}