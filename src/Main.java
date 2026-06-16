import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter preferred array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value to search for: ");
        int target = scanner.nextInt();

        System.out.println("\n Information Provided: ");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);

        System.out.println("\n Using Linear Search");
        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Target FOUND at index: " + linearResult);
        } else {
            System.out.println("Target NOT FOUND in the array.");
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        System.out.println("\n Using Binary Search ");
        System.out.println("Sorted array used: " + Arrays.toString(sortedArray));
        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        if (binaryResult != -1) {
            System.out.println("Target FOUND at index: " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target NOT FOUND in the array.");
        }

        scanner.close();
    }
}