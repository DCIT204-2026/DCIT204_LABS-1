import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        int [] numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int linearIndex = Algorithms.linearSearch(numbers, target);


        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length); // Create a copy for Binary Search


        Arrays.sort(sortedNumbers); // Sort the copied array


        int binaryIndex = Algorithms.binarySearch(sortedNumbers, target);


        System.out.println("\nLinear Search Result:");

        if (linearIndex != -1) {

            System.out.println("Target found at index " + linearIndex);

        } else {

            System.out.println("Target not found.");

        }


        System.out.println("\nBinary Search Result:");

        if (binaryIndex != -1) {

            System.out.println("Target found at index " + binaryIndex  + " in the sorted array."
            );

        } else {

            System.out.println("Target not found.");

        }

        input.close();

    }



}

