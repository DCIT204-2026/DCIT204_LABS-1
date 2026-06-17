public import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] 
        args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

        }

        System.out.print("\nEnter target value: ");
        int target = input.nextInt();

        int linearResult = Algorithm.linearSearch(numbers, target);

        System.out.println("\nLinear Search Result:");

        if (linearResult == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + linearResult);
        }

        Arrays.sort(numbers);

        int binaryResult = Algorithm.binarySearch(numbers, target);

        System.out.println("\nBinary Search Result:");

        if (binaryResult == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + binaryResult);
        }

        input.close();
    }
} {
    
}
