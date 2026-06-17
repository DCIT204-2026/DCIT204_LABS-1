import java.util.Arrays;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = input.nextInt();

        // Linear Search
        int linearResult = Algorithms.linear_search(array, target);

        System.out.println("\nLinear Search Result:");
        System.out.println("Given array: " + Arrays.toString(array));

        if (linearResult != -1) {
            System.out.println("Target(" + target + ") found at index " + linearResult + " in the given array");
        } else {
            System.out.println("Target not found");
        }

        // Create a sorted copy for Binary Search
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Binary Search
        int binaryResult = Algorithms.binary_search(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        if (binaryResult != -1) {
            System.out.println("Target(" + target + ") found at index " + binaryResult +
                               " in the sorted array");
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }
}