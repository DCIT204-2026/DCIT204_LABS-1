import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gathering Array Size
        System.out.print("Kindly enter the array size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        // Collecting elements
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //Collecting target value
        System.out.print("Please enter the target value: ");
        int targetValue = scanner.nextInt();

        System.out.println(); // I just wanted the work to be spacious

        // Calling and Displaying Linear Search Result
        int linearResult = Algorithm.linearSearch(array, targetValue);
        System.out.print("The Linear Search result: ");
        if  (linearResult != -1) {
            System.out.print("The target is found at index " + linearResult);
        }
        else {
            System.out.print("The target is not found.");
        }

        System.out.println(); // Just making the work spacious.

        //Calling and Displaying the Binary Search Result
        int binaryResult = Algorithm.binarySearch(array, targetValue);
        System.out.print("The Binary Search result: ");
        if (binaryResult != -1) {
            System.out.print("It is found at index " + binaryResult);
        }
        else {
            System.out.print("The target is not found.");
        }

        scanner.close();

    }
}

