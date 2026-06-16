import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        // Enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Enter target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        // Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLINEAR SEARCH RESULT:");
        if (linearResult != -1) {
            System.out.println("Target found!");
            System.out.println("Index position: " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // Sort array before Binary Search
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Binary Search
        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nSorted Array for Binary Search:");
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("\nBINARY SEARCH RESULT:");
        if (binaryResult != -1) {
            System.out.println("Target found!");
            System.out.println("Index position in sorted array: " + binaryResult);
        } else {
            System.out.println("Target not found.");
        }

        input.close();
    }

    
}