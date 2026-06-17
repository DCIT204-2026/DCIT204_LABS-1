import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        while (true) {
            System.out.print("Enter array size: ");
            size = scanner.nextInt();
            if (size >= 0) {
                break;
            }
            System.out.println("Array size must be non-negative. Please try again.");
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        System.out.println("\nSorted array: " + Arrays.toString(sortedArray));

        int binaryResult = Algorithm.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result (in sorted array):");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}