import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        // User input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to define how large the array should be
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];

        // Run for the size of the array and collect the numbers
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            // store each elemeent in the array
            array[i] = scanner.nextInt();
        }
        System.out.println();

        // Ask the user for the target value
        System.out.print("Enter target value: ");
        int targetValue = scanner.nextInt();
        System.out.println();

        // Call Linear Search
        System.out.println("Linear Search Result:");
        int resultLinear = Algorithms.linearSearch(array, targetValue);

        // if the element is not found print target not found else proceed
        if (resultLinear == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + resultLinear);
        }
        System.out.println();

        // This sorts the array in ascending order
        Arrays.sort(array);
        System.out.println("Binary Search Result:");
        // Call Binary Search
        int resultBinary = Algorithms.linearSearch(array, targetValue);

        // if the element is not found print target not found else proceed
        if (resultBinary == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + resultBinary);
        }
    }
}