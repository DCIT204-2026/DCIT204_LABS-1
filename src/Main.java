import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        // Create and populate the array
        int[] array = new int[size];

        // Populate the array with the user inputs
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get target value for linear search
        System.out.print("Enter the target value for linear search: ");
        int target = input.nextInt();

        // Perform linear search
        int linearResult = Algorithms.linearSearch(array, target);

        // Sort the array before the binary search
        Arrays.sort(array);

        // Binary search
        int binaryResult = Algorithms.binarySearch(array, target);

        // Displaythe results
        System.out.println("\nLinear Search Result: ");

        if (linearResult != -1) {
            System.out.println("The target is found at index: " + linearResult);
        } else {
            System.out.println("The target cannot be found in the array.");
        }

        // Display the binary search results
        System.out.println("\nBinary Search Result: ");
        if (binaryResult != -1) {
            System.out.println("The target is found at index: " + binaryResult);
        } else {
            System.out.println("The target cannot be found in the array.");
        }

        input.close();
    }
}