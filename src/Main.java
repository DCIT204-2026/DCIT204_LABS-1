import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input sorted array elements
        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform searches
        int linearResult = Algorithms.linearSearch(arr, target);
        int binaryResult = Algorithms.binarySearch(arr, target);

        // Display Linear Search Result
        System.out.println("\n--- Linear Search Result ---");
        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Display Binary Search Result
        System.out.println("\n--- Binary Search Result ---");
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}