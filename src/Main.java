import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Collect Array Size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // 2. Collect Array Elements
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Collect Target Value
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // 4. Perform Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        // 5. Perform Binary Search
        // Since Binary Search requires a sorted array, we clone and sort it 
        // so we don't disrupt the original indexing if the user checks the results.
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        // 6. Display Results
        System.out.println("\n--------------------------------");
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        System.out.println("\nBinary Search Result (on sorted data):");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found in the array.");
        }
        System.out.println("--------------------------------");

        scanner.close();
    }
}