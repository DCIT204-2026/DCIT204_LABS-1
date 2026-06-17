import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        // Create array
        int[] array = new int[size];

        // Get array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // Perform Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        // Sort the array before Binary Search
        Arrays.sort(array);

        // Perform Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);

        // Display Linear Search result
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Display Binary Search result
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }
}