import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //User input for array size and elements2
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int numarr_size = input.nextInt();

        int[] num_arr = new int[numarr_size];
        for (int i = 0; i < numarr_size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            num_arr[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        int searchKey = input.nextInt();

        // Call Linear Search 
        int linearResult = Algorithms.linearSearch(num_arr, searchKey);
         
        // Sort the array for Binary Search
        int[] sorted_arr = num_arr.clone();

        Arrays.sort(sorted_arr);

        // Call Binary Search
        int binaryResult = Algorithms.binarySearch(sorted_arr, searchKey);


        // Display results
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.print("Target found at index " + linearResult);
        } else {
            System.out.println("Target number not found");
        }

        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target number not found");
        }

        input.close();

    }
}