import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // 2. Get array elements
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // 3. Get target value
        System.out.print("\nEnter the target value to search for: ");
        int target = scanner.nextInt();

        System.out.println("\n--- Executing Searches ---");

        // 4. Perform Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\n[Linear Search Results]");
        if (linearResult != -1) {
            System.out.println("Status: Success");
            System.out.println("Target " + target + " found at original index: " + linearResult);
        } else {
            System.out.println("Status: Failed");
            System.out.println("Target " + target + " was not found in the array.");
        }

        // 5. Perform Binary Search
        System.out.println("\n[Binary Search Results]");
        int binaryResult = Algorithm.binarySearch(array, target);

        // Final display of the original index result
        if (binaryResult != -1) {
            System.out.println("Status: Success");
            System.out.println("Target " + target + " found at original index: " + binaryResult);
        } else {
            System.out.println("Status: Failed");
        }

        scanner.close();
    }
}