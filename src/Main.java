import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ─── Step 1: Get array size from user ───────────────────────
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // ─── Step 2: Get array elements from user ───────────────────
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // ─── Step 3: Get target value from user ─────────────────────
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // ─── Step 4: Perform Linear Search ──────────────────────────
        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        // ─── Step 5: Sort array before Binary Search ─────────────────
        // Binary Search REQUIRES a sorted array
        int[] sortedArray = Arrays.copyOf(array, array.length); // Keep original array unchanged
        Arrays.sort(sortedArray); // Sort the copy

        // ─── Step 6: Perform Binary Search ───────────────────────────
        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }

}
