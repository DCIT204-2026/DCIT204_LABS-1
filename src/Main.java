import java.util.Arrays;
import java.util.Scanner;

//Main class to demonstrate search algorithms.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        System.out.println("\nLinear Search Result:");
        int linearResult = Algorithms.linearSearch(numbers, target);
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Binary Search (Requires sorting)
        System.out.println("\nBinary Search Result:");
        Arrays.sort(numbers);
        int binaryResult = Algorithms.binarySearch(numbers, target);

        if (binaryResult != -1) {
            System.out.println("Target found in sorted array at index " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}
