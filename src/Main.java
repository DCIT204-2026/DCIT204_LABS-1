import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements by spacing each of them out:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithms.linearSearch(arr, target);
        if (linearResult != -1) {
            System.out.println("\nLinear Search: Found " + target + " at index " + linearResult);
        } else {
            System.out.println("\nLinear Search: " + target + " not found in the array");
        }

        // Binary Search requires a sorted array
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println("Sorted array for Binary Search: " + Arrays.toString(sortedArr));

        int binaryResult = Algorithms.binarySearch(sortedArr, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Found " + target + " at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Binary Search: " + target + " not found in the array");
        }

        scanner.close();
    }
}