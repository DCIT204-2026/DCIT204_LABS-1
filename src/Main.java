import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size.");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter target value.");
        int target = input.nextInt();

        Arrays.sort(numbers);

        int linearResult = Algorithms.linearSearch(numbers, target);
        int binaryResult = Algorithms.binarySearch(numbers, target);

        System.out.println("Linear Search Result: " + linearResult);
        System.out.println("Binary Search Result: " + binaryResult);

        input.close();
    }
}