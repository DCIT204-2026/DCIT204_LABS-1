import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println(); 

        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        printResult(linearResult);

        Arrays.sort(array); 
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("\nBinary Search Result (Executed on Sorted Array):");
        printResult(binaryResult);

        scanner.close();
    }

    private static void printResult(int resultIndex) {
        if (resultIndex != -1) {
            System.out.println("Target found at index " + resultIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}