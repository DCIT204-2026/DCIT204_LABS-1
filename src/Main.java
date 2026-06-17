import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Get the array size
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();

        // Create and populate array
        int[] array = new int[size];

        // Populate array with the user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get the target value for linear search
        System.out.print("Enter target value for linear search: ");
        int target = input.nextInt();

        // Perform the linear search
        int linearResult = Algorithms.linearSearch(array, target);

        // Sort the array before binary search
        Arrays.sort(array);

        // The binary search
        int binaryResult = Algorithms.binarySearch(array, target);

        // Display the results
        System.out.println("\nLinear Search Result: ");

        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found in array.");
        }

        // Display the binary search results
        System.out.println("\nBinary Search Result: ");
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found in array.");
        }

        input.close();
    }
}