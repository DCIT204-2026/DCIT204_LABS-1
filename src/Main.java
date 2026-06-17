import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // 2. Get array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Get target value
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // 4. Run and display Linear Search (works on unsorted data)
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // 5. Binary Search Requirement: Data must be sorted!
        // We sort it here so binary search evaluates correctly without breaking user
        // intuition.
        Arrays.sort(array);
        System.out.println("\n[Notice] Array has been sorted for Binary Search: " + Arrays.toString(array));

        // 6. Run and display Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}