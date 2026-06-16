import java.util.Arrays;
import java.util.Scanner;

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
        int key = scanner.nextInt();
        System.out.println();



       int linearIndex = Algorithms.linearSearch(array, key);
        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }
        System.out.println();

        Arrays.sort(array);

        int binaryIndex = Algorithms.binarySearch(array, key);
        System.out.println("Binary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();



    }
}