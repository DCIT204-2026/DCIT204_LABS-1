import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(numbers, target);

        Arrays.sort(numbers);
        System.out.println("\nArray sorted for Binary Search:");
        System.out.println(Arrays.toString(numbers));

        int binaryResult = Algorithm.binarySearch(numbers, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}