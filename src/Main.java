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

        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

      
        int linearIndex = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found.");
        }

       
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryIndex = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search Result:");
        System.out.println("(Sorted array used: " + Arrays.toString(sortedArray) + ")");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}