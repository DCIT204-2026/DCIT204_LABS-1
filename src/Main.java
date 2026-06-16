import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        System.out.println();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter input element %d: ", i + 1);
            a[i] = scanner.nextInt();
    }

        System.out.print("\nEnter the key: ");
        int key = scanner.nextInt();

        int linearSearchResult = Algorithms.linearSearch(a, key);
        System.out.println("\nLinear Search Result:");
        if (linearSearchResult != -1) {
            System.out.println("Key found at index " + linearSearchResult);
        }
        else {
            System.out.println("Key not found");
        }

        Arrays.sort(a);
        int binarySearchResult = Algorithms.binarySearch(a, key);
        System.out.println("\nBinary Search Result:");
        if (binarySearchResult != -1) {
            System.out.println("Key found at index " + binarySearchResult);
        } else {
            System.out.println("Key not found");
        }

        scanner.close();
    }
}



