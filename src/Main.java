import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println(" ");

        int[] array = new int[size];

        for (int i = 0;i < size; i++){
            System.out.print("Enter element "+ (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        printResult(linearResult);

        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("\nBinary Search Result:");
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