import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(arr, target);
        System.out.println("Linear Search Result: " + 
            (linearResult != -1 ? "Target found at index " + linearResult : "Not found"));

        // Binary Search needs sorted array
        Arrays.sort(arr); 
        int binaryResult = Algorithm.binarySearch(arr, target);
        System.out.println("Binary Search Result: " + 
            (binaryResult != -1 ? "Target found at index " + binaryResult : "Not found"));

        scanner.close();
    }
}