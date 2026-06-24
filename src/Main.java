import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.valueOf(System.in));
        
        // Sample sorted array to test both linear and binary search
        int[] data = {10, 23, 45, 70, 11, 15};
        
        System.out.println("Available elements in the array: 10, 23, 45, 70, 11, 15");
        System.out.print("Enter a number to search for: ");
        
        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            
            // 1. Run Linear Search
            int linearResult = Algorithms.linearSearch(data, target);
            System.out.println("\n[Linear Search Result]:");
            if (linearResult != -1) {
                System.out.println("Element found at index: " + linearResult);
            } else {
                System.out.println("Element not found in the array.");
            }
            
            // 2. Run Binary Search (Note: Binary search requires a sorted array)
            // Sorting the array dynamically for the binary search demonstration
            java.util.Arrays.sort(data);
            int binaryResult = Algorithms.binarySearch(data, target);
            System.out.println("\n[Binary Search Result (Sorted Array)]:");
            if (binaryResult != -1) {
                System.out.println("Element found at index: " + binaryResult);
            } else {
                System.out.println("Element not found in the array.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        scanner.close();
    }
}
