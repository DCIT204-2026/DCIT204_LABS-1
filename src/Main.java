import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("**The array should be sorted for binary search to work correctly.");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        int linearSearchResult = Algorithms.linearSearch(arr, target);
        System.out.println("Linear Search Result:");
        if (linearSearchResult != -1) {
            System.out.println("Element found at index: " + linearSearchResult  );
        } else {
            System.out.println("Element not found");
        }

        Arrays.sort(arr); // Ensures the array is sorted if user input is not sorted

        int binarySearchResult = Algorithms.binarySearch(arr, target);
        System.out.println("Binary Search Result:");
        if (binarySearchResult != -1) {
            System.out.println("Element found at index: " + binarySearchResult);
        } else {
            System.out.println("Element not found");
        }
        scanner.close();
    }
}