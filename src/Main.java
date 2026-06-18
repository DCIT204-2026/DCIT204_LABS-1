import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect array size
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }
        System.out.println(); // space as in sample interaction

        // Create the array
        int[] array = new int[size];

        // Collect elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("\nInvalid input. Please enter an integer.");
                scanner.close();
                return;
            }
            array[i] = scanner.nextInt();
        }
        System.out.println(); // space as in sample interaction

        // Collect target value
        System.out.print("Enter target value: ");
        if (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int target = scanner.nextInt();
        System.out.println(); // space as in sample interaction

        // Call Linear Search
        int linearIndex = Algorithm.linearSearch(array, target);

        // Display Linear Search Result
        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }
        System.out.println(); // space as in sample interaction

        // Ensure array is sorted for Binary Search
        boolean sorted = isSorted(array);
        if (!sorted) {
            System.out.println("Note: Binary Search requires a sorted array.");
            System.out.println("Sorting the array...");
            Arrays.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
            System.out.println();
        }

        // Call Binary Search
        int binaryIndex = Algorithm.binarySearch(array, target);

        // Display Binary Search Result
        System.out.println("Binary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }

    /**
     * Checks if the given array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if sorted; false otherwise
     */
    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}