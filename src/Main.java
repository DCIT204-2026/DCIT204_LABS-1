<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] dataArray = new int[size];

        // the user to enter the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            dataArray[i] = scanner.nextInt();
        }

        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // Performing a Linear Search on the array

        System.out.println("\nLinear Search Result:");
        int linearResult = Algorithms.LinearSearch(dataArray, target);
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        // Performing a Binary Search on the array

        System.out.println("\nBinary Search Result:");
        int binaryResult = Algorithms.binarySearch(dataArray, target);
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found in the array.");
        }
        scanner.close();
=======
public class Main {
    public static void main(String[] args) {

>>>>>>> a17941715431849598a848611a044f07401d04ec
    }
}