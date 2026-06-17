import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i ++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(arr, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1){
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        Arrays.sort(arr);
        int binaryResult = Algorithm.binarySearch(arr, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1){
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}