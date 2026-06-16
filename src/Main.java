import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int target = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element: ");
        target = scanner.nextInt();

        int binarySearchResult = Algorithms.binarySearch(arr, target);
        if (binarySearchResult != -1) {
            System.out.println("Binary Search: Element found at index " + binarySearchResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        int linearSearchResult = Algorithms.linearSearch(arr, target);
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }
        
        scanner.close();
    }
}