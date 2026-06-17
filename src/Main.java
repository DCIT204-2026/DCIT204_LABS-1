import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
           int target = input.nextInt();


        int linearIndex = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryIndex = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex + " (in sorted array)");
        } else {
            System.out.println("Target not found");
        }

        input.close();

    }
}