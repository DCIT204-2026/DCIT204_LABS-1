import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Array size must be an integer.");
            return;
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size. Array size must be positive.");
            return;
        }

        int[] array = new int[size];
        System.out.println(); // matching sample interaction blank line
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Enter element " + (i + 1) + ": ");
                scanner.next(); // clear the invalid input
            }
            array[i] = scanner.nextInt();
        }

        System.out.println(); // matching sample interaction blank line
        System.out.print("Enter target value: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print("Enter target value: ");
            scanner.next(); // clear
        }
        int target = scanner.nextInt();
        System.out.println(); // matching sample interaction blank line

        // 1. Perform Linear Search
        System.out.println("Linear Search Result:");
        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
        System.out.println(); // blank line

        // 2. Perform Binary Search
        System.out.println("Binary Search Result:");
        
        // Check if the array is sorted
        if (!isSorted(array)) {
            System.out.println("Binary Search cannot be performed. The array must be sorted.");
        } else {
            int binaryResult = Algorithms.binarySearch(array, target);
            if (binaryResult != -1) {
                System.out.println("Target found at index " + binaryResult);
            } else {
                System.out.println("Target not found");
            }
        }

        scanner.close();
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}