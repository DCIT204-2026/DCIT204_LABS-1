import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number required");
        int n = scanner.nextInt();

        int[]array = new int[n];
        System.out.println("enter" + n + "integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("enter the target value: ");
        int target = scanner.nextInt();
        scanner.close();

        int linearResult = Algorithms.linearSearch (array, target);

        int [] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int binaryResults = Algorithms.binarySearch (sortedArray, target);

        System.out.println("\n========== Results ==========");
        System.out.println("Original array : " + Arrays.toString(array));
        System.out.println("Sorted array   : " + Arrays.toString(sortedArray));
        System.out.println("Target value   : " + target);
        System.out.println("-----------------------------");

        if (linearResult != -1) {
            System.out.println("Linear Search  : Found at index " + linearResult
                    + " (original array)");
        } else {
            System.out.println("Linear Search  : Target not found");
        }

        if (binaryResult != -1) {
            System.out.println("Binary Search  : Found at index " + binaryResult
                    + " (sorted array)");
        } else {
            System.out.println("Binary Search  : Target not found");
        }

        System.out.println("=============================");
    }

    }
}