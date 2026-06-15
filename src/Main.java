import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);

        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("LINEAR SEARCH RESULT:");
        if (linearResult != -1) {
            System.out.println("Target " + target + " FOUND at index " + linearResult);
        } else {
            System.out.println("Target " + target + " NOT FOUND in the array.");
        }

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        System.out.println("BINARY SEARCH RESULT:");
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        if (binaryResult != -1) {
            System.out.println("Target " + target + " FOUND at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target " + target + " NOT FOUND in the array.");
        }

        scanner.close();
    }
    
}
