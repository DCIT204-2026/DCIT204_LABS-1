import java.util.Arrays;
import java.util.Scanner;

public class Main {

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
        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");

        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Create a sorted copy for Binary Search
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");

        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult +
                               " in the sorted array");
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }
}