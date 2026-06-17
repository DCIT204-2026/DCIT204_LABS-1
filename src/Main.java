import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = scanner.nextInt();

        //Linear Search
        System.out.println("Linear Search Result: ");
        int linearResult = Algorithms.linearSearch(array,target);
            if (linearResult != -1) {
                System.out.println("Target found at index " + linearResult);
            }  else {
                System.out.println("Target not found.");
            }

        //Binary Search
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        System.out.println("Binary Search Result: ");
        int BinaryResult = Algorithms.BinarySearch(array,target);
            if (BinaryResult != 1) {
                System.out.println("Target found at index " + BinaryResult);
            }  else {
                System.out.println("Target not found.");
            }



    }
}