import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        System.out.println("\nLinear Search Result:");
        int linearIndex = Algorithm.linearSearch(numbers, target);
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        System.out.println("\nBinary Search Result:");
        int binaryIndex = Algorithm.binarySearch(numbers, target);
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }
        
        scanner.close();
    }
}