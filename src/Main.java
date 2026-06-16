
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraysize = scanner.nextInt();
        System.out.println();

        int[] arr = new int[arraysize];
        for (int j = 0; j < arraysize; j++) {
            System.out.print("Enter element " + (j + 1) + ": ");
            arr[j] = scanner.nextInt();
        }

        System.out.println();

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        int linearIndex = Algorithm.linearSearch(arr, target);
        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }
        System.out.println();

        Arrays.sort(arr);

        int binaryIndex = Algorithm.binarySearch(arr, target);
        System.out.println("Binary Search Result:");

        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

    }
}
