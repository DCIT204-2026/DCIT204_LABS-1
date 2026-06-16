import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int linearSearchResult = Algorithms.linearSearch(array, target);

        int binarySearchResult = Algorithms.binarySearch(array, target);

        System.out.println("Linear Search Result:\nTarget found at index " + linearSearchResult);
        System.out.println("Binary Search Result:\nTarget found at index " + binarySearchResult);

        scanner.close();
    }
}