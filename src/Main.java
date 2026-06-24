import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine().trim());

        int[] originalArray = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            originalArray[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = Integer.parseInt(scanner.nextLine().trim());

        // Linear Search works on the array exactly as the user entered it.
        int linearResultIndex = Algorithm.linearSearch(originalArray, target);

        // Binary Search requires sorted data, so a sorted copy of the
        // array is created here. The original array is left untouched
        // so the Linear Search result above still reflects the user's
        // original input order.
        int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);
        Arrays.sort(sortedArray);
        int binaryResultIndex = Algorithm.binarySearch(sortedArray, target);

        System.out.println();
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Sorted array (used for Binary Search): " + Arrays.toString(sortedArray));

        System.out.println();
        System.out.println("Linear Search Result:");
        printResult(linearResultIndex);

        System.out.println();
        System.out.println("Binary Search Result:");
        printResult(binaryResultIndex);

        scanner.close();
    }

    private static void printResult(int index) {
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
