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

        int linearIndex = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        Arrays.sort(array);

        int binaryIndex = Algorithms.binarySearch(array, target);
        System.out.println("\nBinary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
