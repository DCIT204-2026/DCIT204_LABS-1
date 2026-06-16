import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){

            System.out.print("Enter element "+ (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(arr,target);
        int binaryResult = Algorithm.binarySearch(arr, target);

        System.out.println("Linear Search Result: " + (linearResult != -1 ? "Target found at index " + linearResult : "Target not found"));
        System.out.println("Binary Search Result: " + (binaryResult != -1 ? "Target found at index " + binaryResult : "Target not found"));

        scanner.close();
    }
}