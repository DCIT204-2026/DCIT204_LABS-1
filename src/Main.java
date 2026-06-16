import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid size.");
            scanner.close();
            return;
        }
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter an integer for element " + (i + 1) + ": ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }

        System.out.print("\nEnter target value: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter an integer target value: ");
            scanner.next();
        }
        int target = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}