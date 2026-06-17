import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of your array: ");
        for(int i = 0; i <= size -1; i++) {
            System.out.println("Enter element number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the target value to obtain: ");
        int target = input.nextInt();

        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result: ");
        if(linearResult != -1){
            System.out.println("Target found at index " + linearResult);
        }else {
            System.out.println("Target not found in this array");
        }

        Arrays.sort(array);

        int theBinaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Result: ");

        if(theBinaryResult != -1){
            System.out.println("Target found at index: " + theBinaryResult + " (in the sorted array)");
        }else {
            System.out.println("Target not found in this array.");
        }
        input.close();
    }
}