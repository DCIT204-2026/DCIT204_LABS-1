import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        if (linearResult != -1) {
            System.out.println("Linear Search: Found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Not found");
        }

        // Sort user array to allow binary search
        Arrays.sort(array);

        // binary search
        int binaryResult = Algorithms.binarySearch(array, target);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Not found");
        }

        scanner.close();
    }
}