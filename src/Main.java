import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // User input for array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // User input for target value
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        System.out.println();

        // Call Linear Search
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();

        // Sort array for Binary Search
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        // Call Binary Search
        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }

        scanner.close();

        System.out.println();
    }
}