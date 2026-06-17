import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter? ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("\nEnter the numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.print("\nWhich number would you like to search for? ");
        int target = input.nextInt();
        int linearResult = Algorithms.linearSearch(numbers, target);
        Arrays.sort(numbers);
        int binaryResult = Algorithms.binarySearch(numbers, target);
        System.out.println("\n----- Linear Search -----");
        if (linearResult != -1) {
            System.out.println("Found at index " + linearResult);
        } else {
            System.out.println("Number not found.");
        }
        System.out.println("\n----- Binary Search -----");

        if (binaryResult != -1) {
            System.out.println("Found at index " + binaryResult);
        } else {
            System.out.println("Number not found.");
        }
        input.close();
    }
}