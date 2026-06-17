import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Allow the user to enter the size of the array
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // 2. Allow the user to enter the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Allow the user to enter the target value to search for
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        
        System.out.println(); // Blank line for formatting

        // 4. Perform Linear Search
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
        
        System.out.println();

        // 5. Binary search requires sorted data.
        // We sort the array before calling Binary Search.
        Arrays.sort(array);

        // 6. Perform Binary Search
        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
