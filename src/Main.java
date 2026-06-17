import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Collect array size ---
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // --- Collect array elements ---
        int[] array = new int[size];
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // --- Collect target value ---
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // --- Linear Search (works on the original, unsorted array) ---
        int linearResult = Algorithm.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // --- Binary Search (requires sorted array) ---
        // Sort a copy so we don't change the original array's order
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
