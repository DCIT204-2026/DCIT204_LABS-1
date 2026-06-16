import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        System.out.println();
        System.out.println("Linear Search Result:");
        int linearIndex = Algorithm.linearSearch(array, target);
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();
        System.out.println("Binary Search Result:");
        // Ensure array is sorted for binary search
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        
        int binaryIndex = Algorithm.binarySearch(sortedArray, target);
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
            if (!Arrays.equals(array, sortedArray)) {
                System.out.println("(Note: Index is based on the sorted version of the array)");
            }
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}