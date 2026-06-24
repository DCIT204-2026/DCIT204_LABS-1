import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Target not found");
        }

        int binaryResult = Algorithms.binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Target found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Target not found");
        }

        scanner.close();
    }
}