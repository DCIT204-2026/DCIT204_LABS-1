import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter array element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nResult by using linear search method: ");
        if (linearResult != -1){
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();

        // Binary Search
        Arrays.sort(array);

        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Result On Sorted Array:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}