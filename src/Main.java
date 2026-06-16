import java.util.Arrays;
import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Code to get the size of the array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        // Code to get the elements in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Code to get target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        //  Linear Search Algorithm
        int linearResult = Algorithms.linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search Result: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search Result: Target not found");
        }

        // Code to sort array before Binary Search
        Arrays.sort(array);

        // Binary Search Algorithms
        int binaryResult = Algorithms.binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search Result: Target found at index " + binaryResult);
        } else {
            System.out.println("Binary Search Result: Target not found");
        }

        sc.close();
    }
}
