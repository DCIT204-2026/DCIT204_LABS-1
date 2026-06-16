import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        System.out.print("Enter the targeted value: ");
        int target = scan.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        Arrays.sort(array);

        int binaryResult = Algorithms.binarySearch(array, target);

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scan.close();
    }
}