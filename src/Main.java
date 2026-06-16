import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for the size of the array
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // 2. Ask the user to type in each number
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Ask for the number they want to find
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // 4. Run Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // 5. Sort the array automatically so Binary Search can work correctly
        Arrays.sort(array);

        // 6. Run Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("\nBinary Search Result (Performed on sorted array):");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
