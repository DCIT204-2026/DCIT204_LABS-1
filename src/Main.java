import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // 2. Get array elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Get target value
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // 4. Linear Search (works on the array as entered, unsorted is fine)
        int linearResult = Algorithm.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // 5. Binary Search requires a sorted array, so we sort a copy first
        int[] sortedArray = Algorithm.sortArray(array);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}