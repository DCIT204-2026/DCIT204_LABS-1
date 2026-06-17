import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        while (true) {
            System.out.print("Enter array size: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Array size must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        int[] array = new int[size];
        System.out.println();

        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                }
            }
        }
        System.out.println();

        int target = 0;
        while (true) {
            System.out.print("Enter target value: ");
            if (scanner.hasNextInt()) {
                target = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        System.out.println();

        System.out.println("Linear Search Result:");
        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array");
        }
        System.out.println();

        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        int[] searchArray = array;
        if (!isSorted) {
            System.out.println("Notice: The input array is unsorted. Binary Search requires a sorted array.");
            System.out.println("Sorting a copy of the array for Binary Search...");
            searchArray = Arrays.copyOf(array, array.length);
            Arrays.sort(searchArray);
            System.out.println("Sorted Array: " + Arrays.toString(searchArray));
        }

        System.out.println("Binary Search Result:");
        int binaryResult = Algorithms.binarySearch(searchArray, target);
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found in the array");
        }

        scanner.close();
    }
}