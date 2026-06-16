import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create and populate the array
        int[] array = new int[size];

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get target value for linear search
        System.out.print("Enter the target value for linear search: ");
        int target = input.nextInt();

        // Perform linear search
        int linearResult = Algorithms.linearSearch(array, target);

        // Sort array before binary search
        Arrays.sort(array);

        // Binary search
        int binaryResult = Algorithms.binarySearch(array, target);

        // Display results
        System.out.println("\nLinear Search Result: ");

        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        // Display binary search results
        System.out.println("\nBinary Search Result: ");
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        input.close();
    }
}