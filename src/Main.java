import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        // Enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Enter target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        // Call Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        // Sort array for Binary Search
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        // Call Binary Search
        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        // Display results
        System.out.println("\n--- Search Results ---");

        if (linearResult != -1) {
            System.out.println("Linear Search: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Target not found.");
        }

        if (binaryResult != -1) {
            System.out.println("Binary Search: Target found at index " + binaryResult + " in the sorted array.");
        } else {
            System.out.println("Binary Search: Target not found.");
        }

        input.close();
    }
}