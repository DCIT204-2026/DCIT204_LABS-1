import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Fill the array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get target value
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Sort array before Binary Search
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Binary Search
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
