import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Input the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Input the target value: ");
        int target = scanner.nextInt();

        int linearIndex = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Th target found at index " + linearIndex);
        } else {
            System.out.println("Target is not found");
        }
        int[] sortedCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedCopy);

        int binaryIndex = Algorithms.binarySearch(sortedCopy, target);
        System.out.println("\nBinary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("The target is found at index " + binaryIndex + " in the sorted array");
        } else {
            System.out.println("The Target is not found");
        }

        scanner.close();
    }
}