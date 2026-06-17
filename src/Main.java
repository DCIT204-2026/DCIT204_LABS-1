import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        // Create the array
        int[] array = new int[size];
        
        // Ask user to enter each number
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Ask for the number to search
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        
        // Do Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        
        // Do Binary Search (need to sort first)
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);
        
        // Show the results
        System.out.println("\n--- Search Results ---");
        
        if (linearResult != -1) {
            System.out.println("Linear Search Result: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search Result: Target not found");
        }
        
        if (binaryResult != -1) {
            System.out.println("Binary Search Result: Target found at index " + binaryResult);
        } else {
            System.out.println("Binary Search Result: Target not found");
        }
        
        scanner.close();
    }
}