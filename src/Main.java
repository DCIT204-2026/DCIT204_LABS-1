import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ── 1. Collect array size ──────────────────────────────────────────
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // ── 2. Collect array elements ──────────────────────────────────────
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // ── 3. Collect target value ────────────────────────────────────────
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // ── 4. Linear Search (works on original unsorted array) ────────────
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // ── 5. Binary Search (requires a sorted array) ─────────────────────
        int[] sortedArray = array.clone();   // keep original intact
        Arrays.sort(sortedArray);

        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}