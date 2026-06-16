import java.util.Scanner;
import java.util.Arrays; // We need this to automatically sort the array for Binary Search

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask user for the size of the array
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // 2. Ask user to type in the array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Ask user for the target number they want to find
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // 4. Run and display Linear Search Results
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // 5. Sort the array so Binary Search works accurately!
        Arrays.sort(array);

        // 6. Run and display Binary Search Results
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("\nBinary Search Result (on sorted array):");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}