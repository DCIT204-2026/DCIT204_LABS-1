import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Target not found");
        }

        // Binary Search
        Arrays.sort(array); //  sort first
        int binaryResult = Algorithm.binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Target found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Target not found");
        }
    }
    }
