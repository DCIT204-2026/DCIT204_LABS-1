import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        foSSSr (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = scanner.nextInt();

        // Test Linear Search
        int linearResult = Algorithm.linearSearch(arr, target);
        if (linearResult!= -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        // Test Binary Search - array must be sorted first
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int binaryResult = Algorithm.binarySearch(arr, target);
        if (binaryResult!= -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        scanner.close();
    }
}