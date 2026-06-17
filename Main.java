import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter your target number: ");
        int target = input.nextInt();

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        int linearSearchResult = Algorithms.linearSearch(arr, target);

        System.out.println("\n--- Linear Search Result ---");

        if (linearSearchResult != -1) {
            System.out.println("Target found.");
            System.out.println("Target Number found at index: " + linearSearchResult);
        } else {
            System.out.println("Target not found.");
        }

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        System.out.println("\nSorted Array for Binary Search: " + Arrays.toString(sortedArr));

        int binarySearchResult = Algorithms.binarySearch(sortedArr, target);

        System.out.println("\n--- Binary Search Result ---");

        if (binarySearchResult != -1) {
            System.out.println("Target found.");
            System.out.println("Target Number found at index: " + binarySearchResult);
        } else {
            System.out.println("Target not found.");
        }

        input.close();
    }
}