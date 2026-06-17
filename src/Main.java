import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        // Create array
        int[] array = new int[size];

        // Get the elements in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get target value
        System.out.print("\nEnter target value: ");
        int target = input.nextInt();

        // for Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target was found at index " + linearResult);
        } else {
            System.out.println("No matching element was found");
        }

        // Sort array before Binary Search
        Arrays.sort(array);

        // Binary Search
        int binaryResult = Algorithms.binarySearch(array, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("The  target value was not found in the array");
        }

        input.close();
    }
}