import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements: " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = input.nextInt();

        int linearResult = Algorithms.linearSearch(arr, target);
        System.out.println("\nLinear Search result: ");

        if  (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else  {
            System.out.println("Target not found");
        }


        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int binaryResult = Algorithms.binarySearch(sortedArr, target);
        System.out.println("\nBinary Search result: ");
        System.out.println("Operations performed on a sorted copy of the array: " + Arrays.toString(sortedArr));

        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult + " in the sorted array ");

        } else   {
            System.out.println("Target not found");

        }

        input.close();

    }
}
