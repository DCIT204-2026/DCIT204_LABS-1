import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user how big the array should be
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Step 2: Let the user fill in the array elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 3: Ask for the target value to search for
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // Step 4: Run Linear Search and display the result
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Step 5: Run Binary Search and display the result
        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }

}
