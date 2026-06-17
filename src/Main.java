import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        // Create array
        int[] array = new int[size];

        // Get array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Sort array for Binary Search
        Arrays.sort(array);

        // Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult +
                    " in the sorted array");
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
