import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");

        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Make sure your array is sorted.");

        for (int i = 1; i <= n; i++){
            System.out.println("Enter element " + i + ":");
            array[i - 1] = scanner.nextInt();
        }
        

        System.out.println("Enter target value: ");

        int target = scanner.nextInt();

        System.out.println("Linear Search Result: " + "Target found at index " + Algorithms.linearSearch(array, target));
        System.out.println("Binary Search Result: " + "Target found at index " + Algorithms.binarySearch(array, target));

        scanner.close();
    }
}