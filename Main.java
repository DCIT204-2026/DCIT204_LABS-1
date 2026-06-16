import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ── 1. Array size ────────────────────────────────────────────────────
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // ── 2. Array elements ────────────────────────────────────────────────
        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // ── 3. Target value ──────────────────────────────────────────────────
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();
        scanner.close();

        // ── 4. Linear Search ─────────────────────────────────────────────────
        int linearResult = Algorithm.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        // ── 5. Binary Search (requires a sorted array) ───────────────────────
        // Sort a copy so the original order (used for linear search) is kept.
        int[] sortedArray = Arrays.copyOf(array, size);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult
                    + " (in the sorted array: " + Arrays.toString(sortedArray) + ")");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
