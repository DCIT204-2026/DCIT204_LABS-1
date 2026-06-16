import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = input.nextInt();

        //Linear Search
        int linearResult = Algorithms.linearSearch(arr, target);
        System.out.println("\n Linear Search Result: ");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        }else{
            System.out.println("Target not found");
        }

        //Sort for Binary Search
        Arrays.sort(arr);

        //Binary Search
        int binaryResult = Algorithms.binarySearch(arr, target);
        System.out.println("Binary Search Result: ");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        }else{
            System.out.println("Target not found");
        }

        input.close();


    }
}