
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        System.out.println("Program Started");

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

        int linearResult =
                Algorithm.linearSearch(array, target);

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);

        int binaryResult =
                Algorithm.binarySearch(sortedArray, target);

        System.out.println("\nLinear Search Result:");

        if (linearResult != -1) {
            System.out.println(
                    "Target found at index "
                            + linearResult);
        } else {
            System.out.println(
                    "Target not found");
        }

        System.out.println("\nBinary Search Result:");

        if (binaryResult != -1) {
            System.out.println(
                    "Target found at index "
                            + binaryResult);
        } else {
            System.out.println(
                    "Target not found");
        }

        scanner.close();
    }
}