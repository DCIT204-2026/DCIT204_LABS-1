import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Enter array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Enter target value
        System.out.print("Enter target value: ");
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
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}