import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        
        System.out.println();
        System.out.print("Enter target value: ");
        int target = input.nextInt();
        
        System.out.println();
        
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
        
        System.out.println();
        
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        
        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }
        
        input.close();
    }
}