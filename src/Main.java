import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int number = input.nextInt();

        int[] array = new int[number];

        System.out.println("Binary Search requires a sorted array");

        for (int i = 0; i < number; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = input.nextInt();
        }

        System.out.println("Enter the value to search for");
        int target = input.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search Result:" + target + " found at index " + linearResult);
        } else {
            System.out.println("Linear Search Result: " + target + " not found");
        }

        int binaryResult = Algorithms.binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search Result:" + target + " found at index " + binaryResult);
        } else {
            System.out.println("Binary Search Result: " + target + " not found");
        }

        input.close();
    }
}