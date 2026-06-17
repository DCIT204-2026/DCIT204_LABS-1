import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        System.out.println(linearResult != -1
            ? "Target found at index " + linearResult
            : "Target not found");

        // Binary Search needs a sorted array, so sort a copy
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithm.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult != -1
            ? "Target found at index " + binaryResult
            : "Target not found");

        scanner.close();
    }
}