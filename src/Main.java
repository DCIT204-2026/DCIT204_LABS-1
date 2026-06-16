import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter element " + (i + 1) + ":" );
            array[i] = scanner.nextInt();

        }
        System.out.println("Enter target element");
        int target = scanner.nextInt();

        scanner.close();

        int linearResult = Algorithms.linearSearch(array, target);


        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        int binaryResult = Algorithms.binarySearch(array, target);


        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }
    }
}