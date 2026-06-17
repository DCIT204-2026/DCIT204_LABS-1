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

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        if (linearResult != -1) {
            System.out.println("\nLinear Search Result:");
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("\nLinear Search Result:");
            System.out.println("Target not found");
        }

        // Sort array for binary search
        Arrays.sort(array);

        int binaryResult = Algorithm.binarySearch(array, target);

        if (binaryResult != -1) {
            System.out.println("\nBinary Search Result:");
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("\nBinary Search Result:");
            System.out.println("Target not found");
        }

        input.close();
    }
}