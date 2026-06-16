import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To get array size 
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // To get array elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // To get target
        System.out.print("Enter your target value: ");
        int target = scanner.nextInt();


        // Linear Search
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result is:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("target not found.");
        }

        // binary search requires array to be sorted. This means the result will be based on this sorted array.
        Arrays.sort(array);


        // Binary Search
        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("\nBinary Search Result is:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("target not found.");
        }

        scanner.close();
    }
}