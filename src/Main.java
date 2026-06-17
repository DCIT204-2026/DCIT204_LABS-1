import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input "Enter the array size:"
        System.out.print( ");Enter the array size: ");
        int n = input.nextInt();
        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println();

        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        System.out.println();
        
        //1. perfoming linear search
        int linearSearchResult = Algorithms.linearSearch(arr, target);
        System.out.println("Linear search result: ");
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Target found at index " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Target not found");
        }

            System.out.println();

        //2. perfoming binary search
        // Sort the array before performing binary search
        Arrays.sort(arr);
        int binarySearchResult = Algorithms.binarySearch(arr, target);
        System.out.println("Binary search result: ");
        if (binarySearchResult != -1) {
            System.out.println("Binary Search: Target found at index " + binarySearchResult);
        } else {
            System.out.println("Binary Search: Target not found");

        }
    }

}