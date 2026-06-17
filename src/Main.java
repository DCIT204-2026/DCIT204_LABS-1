import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.print("Enter the target value to search: ");
        int target = input.nextInt();


        int result = Algorithms.binarySearch(arr, target);
        System.out.println("Binary Search Result:");
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Linear Search Result:");
        int linearResult = Algorithms.linearSearch(arr, target);
        if (linearResult != -1) {
            System.out.println("Element found at index: " + linearResult);
        } else {
            System.out.println("Element not found");
        }

        input.close();
    }
}
