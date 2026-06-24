import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Get array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();


        // Create array
        int[] numbers = new int[size];


        // Get array elements
        for (int i = 0; i < size; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

        }


        // Get target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();


        // Linear Search
        int linearResult = Algorithm.linearSearch(numbers, target);


        // Sort array before Binary Search
        Arrays.sort(numbers);


        // Binary Search
        int binaryResult = Algorithm.binarySearch(numbers, target);


        // Display Linear Search Result
        System.out.println("\nLinear Search Result:");

        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        }

        else {
            System.out.println("Target not found");
        }


        // Display Binary Search Result
        System.out.println("\nBinary Search Result:");

        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        }

        else {
            System.out.println("Target not found");
        }


        input.close();

    }

}