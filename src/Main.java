import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("The array must be sorted");

            System.out.print("\nEnter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println("\nThe target value is " + target);


        System.out.println("\n Linear Search Result: ");
        System.out.println("Target found at index "+ Algorithms.linearSearch(arr, target));

        System.out.println("\nBinary Search Result: ");
        System.out.println("Target found at index "+ Algorithms.binarySearch(arr, target));


        sc.close();
    }
}