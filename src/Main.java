import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Step 2: Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Get target value
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Step 4: Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        if (linearResult != -1) {
            System.out.println("Linear Search: Found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Not found");
        }

        // Step 5: Sort array for Binary Search
        Arrays.sort(array);

        // Step 6: Binary Search
        int binaryResult = Algorithms.binarySearch(array, target);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Found at index " + binaryResult);
        } else {
            System.out.println("Binary Search : Not found");
        }

        scanner.close();
    }
}