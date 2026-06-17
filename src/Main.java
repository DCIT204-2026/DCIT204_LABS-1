import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of letters: ");
        int size = input.nextInt();

        char[] array = new char[size];

        // Input letters
        for (int i = 0; i < size; i++) {
            System.out.print("Enter letter " + (i + 1) + ": ");
            array[i] = input.next().charAt(0);
        }

        // Input target
        System.out.print("Enter target letter: ");
        char target = input.next().charAt(0);

        // Linear Search
        int linearResult = Algorithm.linearSearch(array, target);

        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Letter found at index " + linearResult);
        } else {
            System.out.println("Letter not found");
        }

        // Sort for Binary Search
        Arrays.sort(array);

        // Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);

        System.out.println("\nBinary Search Result (Sorted Array):");
        System.out.println(Arrays.toString(array));

        if (binaryResult != -1) {
            System.out.println("Letter found at index " + binaryResult);
        } else {
            System.out.println("Letter not found");
        }

        input.close();
    }
}