import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        //Inputting elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // set target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);

        // Sort before binary search
        Arrays.sort(array);

        int binaryResult = Algorithms.binarySearch(array, target);

        //  results
        System.out.println("\nLinear Search Result:");
        System.out.println(linearResult != -1
                ? "Found at index " + linearResult
                : "Not found");

        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult != -1
                ? "Found at index " + binaryResult
                : "Not found");

        input.close();
    }
}
    