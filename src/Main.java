import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println();

        int[] array = new int[size];

        System.out.println("IMPORTANT: Binary search takes elements in sorted order!");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
        System.out.println();

        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}