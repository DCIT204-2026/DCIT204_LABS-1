import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- User Input: Array Size ---
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // --- User Input: Array Elements ---
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // --- User Input: Target Value ---
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // --- Linear Search ---
        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // --- Binary Search (requires sorted array) ---
        // Sort a copy so the original order is preserved for Linear Search display
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        System.out.println("(Array sorted for Binary Search)");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " in the sorted array");
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}