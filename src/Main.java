import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int linearResult = Algorithm.linearSearch(array, target);
        int binaryResult = Algorithm.binarySearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Found at index " + linearResult);
        } else {
            System.out.println("Not found");
        }

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Found at index " + binaryResult);
        } else {
            System.out.println("Not found");
        }

        input.close();
    }
}