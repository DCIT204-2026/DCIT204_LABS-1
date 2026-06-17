import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for size.");
            scanner.close();
            return;
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Enter element " + (i + 1) + ": ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer for the target value.");
            System.out.print("Enter target value: ");
            scanner.next();
        }
        int target = scanner.nextInt();

        System.out.println();

        // 1. Perform Linear Search
        int linearIndex = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();

        // 2. Perform Binary Search
        // Check if sorted, and sort if not sorted.
        if (!isSorted(array)) {
            System.out.println("Notice: The input array was not sorted. Sorting the array for Binary Search...");
            Arrays.sort(array);
            System.out.println("Sorted Array: " + Arrays.toString(array));
        }

        int binaryIndex = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}