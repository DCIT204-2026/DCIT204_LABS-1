import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        int linearResult = Algorithm.linearSearch(arr, target);

        System.out.println("\n=== Linear Search Result ===");
        if (linearResult != -1) {
            System.out.println("Target found!");
            System.out.println("Index Position: " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        int binaryResult = Algorithm.binarySearch(sortedArr, target);

        System.out.println("\n=== Binary Search Result ===");
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));

        if (binaryResult != -1) {
            System.out.println("Target found!");
            System.out.println("Index Position in sorted array: " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        input.close();
    }
}