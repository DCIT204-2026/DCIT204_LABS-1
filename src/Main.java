import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        System.out.println("\n-----------------------------");
        System.out.println("Linear Search Result:");
        int linearResult = Algorithm.linearSearch(array, target);
        displayResult(linearResult);

        Arrays.sort(array);
        System.out.println("\nBinary Search Result (Array sorted for analysis):");
        int binaryResult = Algorithm.binarySearch(array, target);
        displayResult(binaryResult);
        System.out.println("-----------------------------");

        scanner.close();
    }

    private static void displayResult(int index) {
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}