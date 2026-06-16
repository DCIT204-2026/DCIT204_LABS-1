import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");    //User enters array size
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements:");  //User enters elements for array
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int result = Algorithm.binarySearch(array, target);

        System.out.println("\n===== SEARCH RESULT =====");
        System.out.println("Target Value: " + target);

        if (result == -1) {
            System.out.println("Status: Not Found");
        } else {
            System.out.println("Status: Found");
            System.out.println("Index: " + result);
        }
    }
}
//final submission by 22392509
