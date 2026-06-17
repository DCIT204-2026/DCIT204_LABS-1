import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length: ");

        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + "numbers: ");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        System.out.print("Enter the target number to search: ");
        int target = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search result: " + linearResult);
        
        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search result: " + binaryResult);
        
        scanner.close();

    }
}