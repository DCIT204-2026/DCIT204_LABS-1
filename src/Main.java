import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Searching Algorithm Display-----");

        //Get size of array from user
        System.out.println("Enter the number of elements in your array: ");
        int size = scanner.nextInt();
        int [] numbers = new int[size];

        //Get elements of the array from the user
        System.out.println("Enter " + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        //Get the target value from the user
        System.out.print("\nEnter the number you want to search for: ");
        int target = scanner.nextInt();

        System.out.println("\n===============================");
        System.out.println("Executing the Search Algorithms");
        System.out.println("===============================");

        //Linear Search Execution
        System.out.println("1. Linear Search Result:");
        int linearResult = Algorithms.linearSearch(numbers, target);

        if (linearResult != -1) {
            System.out.println("Hit!! Target found at index: " + linearResult);
            }
        else {
            System.out.println("Miss!! Target not found in your array.");
             }
        System.out.println();

        //Binary Search Execution
        System.out.println("2. Binary Search Result:");
        int binaryResult = Algorithms.binarySearch(numbers, target);

        //Array must be sorted first
        Arrays.sort(numbers);
        System.out.println("Array automatically sorted: " + Arrays.toString(numbers));
        
        if (binaryResult != -1) {
            System.out.println("Hit!! Target found at index: " + binaryResult);
            }
        else {
            System.out.println("Miss!! Target not found in your array.");
             }
        
        System.out.println("===============================");

        scanner.close();
    }
}
