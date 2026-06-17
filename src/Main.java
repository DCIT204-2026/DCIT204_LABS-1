
import java.util.Scanner;


 
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

         
        int linearResultIndex = Algorithms.linearSearch(array, target);

        System.out.println();
        System.out.println("Linear Search Result:");
        if (linearResultIndex != -1) {
            System.out.println("Target found at index " + linearResultIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        
         
        
        int[] sortedArray = Algorithms.sortArray(array);
        int binaryResultIndex = Algorithms.binarySearch(sortedArray, target);

        System.out.println();
        System.out.println("Binary Search Result:");
        if (binaryResultIndex != -1) {
            System.out.println("Target found at index " + binaryResultIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        
        



        scanner.close();
    }
}