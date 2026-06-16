import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Fill the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get target value
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // Linear Search (works on original array)
        int linearResult = Algorithm.linearSearch(array, target);

        // Create a sorted copy for Binary Search
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        // Display results
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}