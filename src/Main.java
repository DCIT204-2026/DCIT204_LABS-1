import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // User input for array elements
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // User input for target value
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        System.out.println();

        // Call Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();

        // Note: Binary Search requires a sorted array. 
        // We will sort the array here, or assume the user entered it sorted (as per sample).
        // If the user entered it sorted, Arrays.sort won't change it. If they didn't, it fixes it for Binary Search.
        // We'll create a copy so we don't mess up the original array just in case, but sorting in place is fine here.
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        // Let's check if the array was modified to warn the user, as indices change.
        boolean wasSorted = Arrays.equals(array, sortedArray);
        if (!wasSorted) {
             System.out.println("(Note: The array was sorted for Binary Search: " + Arrays.toString(sortedArray) + ")");
        }

        // Call Binary Search
        int binaryResult = Algorithm.binarySearch(sortedArray, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}