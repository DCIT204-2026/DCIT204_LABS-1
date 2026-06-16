import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("\nEnter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println("\nThe target value is " + target);


        int linearResult = Algorithms.linearSearch(arr, target);
        System.out.println("\nLinear Search Result:");

        if(linearResult == -1)
        {
            System.out.println("Target not found");
        }
        else
        {
            System.out.println("Target found at index " + linearResult);
        }

        Arrays.sort(arr);
        int binaryResult = Algorithms.binarySearch(arr, target);
        System.out.println("\nBinary Search Result:");

        if(binaryResult == -1)
        {
            System.out.println("Target not found");
        }
        else
        {
            System.out.println("Target found at index " + binaryResult);
        }
        sc.close();
    }
}