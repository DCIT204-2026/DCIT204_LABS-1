import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = input.nextInt();


        //Linear Search operation
        int linearResult = Algorithms.linearSearch(numbers, target);

        System.out.println("\nLinear Search:");
        if (linearResult == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + linearResult);
        }


        //Array sorting
        int[] sortedArray = numbers.clone();
        Arrays.sort(sortedArray);

        //Binary Search operation
        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        System.out.println("\nBinary Search:");
        if (binaryResult == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + binaryResult);
        }


        input.close();
    }
}