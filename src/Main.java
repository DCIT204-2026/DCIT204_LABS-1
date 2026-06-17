import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get an array size from user
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.println(); // Add this blank line

        // 2. Create an array and fill it with user input
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();

        // 3. Get target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println();

        // 4. Sort array for binary search
        Arrays.sort(array);

        // 5. Call Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        // 6. Call Binary Search
        int binaryResult = Algorithms.binarySearch(array, target);

        // 7. Displlay results
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1){
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1){
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        sc.close();


    }
}