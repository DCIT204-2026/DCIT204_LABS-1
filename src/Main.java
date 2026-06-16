import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input part
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // doing linear search
        int res1 = Algorithm.linearSearch(nums, target);
        System.out.println("\nLinear Search Result:");
        if (res1 != -1) {
            System.out.println("Found at index " + res1);
        } else {
            System.out.println("Not found in array");
        }

        // sorting for binary search
        Arrays.sort(nums);
        System.out.println("\nArray after sorting: " + Arrays.toString(nums));

        // doing binary search
        int res2 = Algorithm.binarySearch(nums, target);
        System.out.println("Binary Search Result:");
        if (res2 != -1) {
            System.out.println("Found at index " + res2);
        } else {
            System.out.println("Not found in array");
        }

        input.close();
    }
}