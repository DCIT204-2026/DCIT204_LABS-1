import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Step 2: Fill array with user input
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 3: Get target value
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // Step 4: Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Step 5: Sort a copy for Binary Search (preserves original)
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Algorithm.bubbleSort(sortedArray);

        // Step 6: Binary Search on sorted array
        int binaryResult = Algorithm.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}