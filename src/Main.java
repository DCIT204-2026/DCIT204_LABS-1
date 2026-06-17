import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for array size
        System.out.print("How many numbers will you enter? ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        // Input array elements
        for (int idx = 0; idx < length; idx++) {
            System.out.print("Enter number " + (idx + 1) + ": ");
            numbers[idx] = input.nextInt();
        }

        // Input search value
        System.out.print("Enter the value to search for: ");
        int searchValue = input.nextInt();

        // Linear Search
        int linearPos = Algorithms.findLinear(numbers, searchValue);

        if (linearPos != -1) {
            System.out.println("Linear Search: Found at index " + linearPos);
        } else {
            System.out.println("Linear Search: Value not found");
        }

        // Sort array for Binary Search
        Arrays.sort(numbers);

        // Binary Search
        int binaryPos = Algorithms.findBinary(numbers, searchValue);

        if (binaryPos != -1) {
            System.out.println("Binary Search: Found at index " + binaryPos);
        } else {
            System.out.println("Binary Search: Value not found");
        }

        input.close();
    }
}