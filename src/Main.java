import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Enter array elements
        for (int i = 0; i < size; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Sort array for binary search
        Arrays.sort(arr);

        // Enter target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // Call linear search
        int linearResult = Algorithm.linearSearch(arr, target);

        // Call binary search
        int binaryResult = Algorithm.binarySearch(arr, target);

        // Display Linear Search result
        System.out.println("\nLinear Search Result:");

        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Display Binary Search result
        System.out.println("\nBinary Search Result:");

        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }
}
