import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int array_size = input.nextInt();
        int [] elements = new int[array_size];

        for (int i=0; i < array_size; i++){
            System.out.println("Enter the elements of the array " + (i + 1) + ": ");
            elements[i] = input.nextInt();
        }

        Arrays.sort(elements);
        int[] sorted_array = elements;
        System.out.println("Sorted array: " + Arrays.toString(sorted_array));
        
        System.out.print("Enter specific value: ");
        int specific_value = input.nextInt();
        int [] values = new int[specific_value];
        input.close();

        int linearResult = Algorithms.linearSearch(sorted_array, specific_value);
        if (linearResult != -1){
            System.out.println("LinearSearch result:");
            System.out.println("Element found at key " + linearResult);
        } else{
            System.out.println("NOT_FOUND");
        }

        int binaryResult = Algorithms.binarySearch(sorted_array, specific_value);
        if (binaryResult != -1){
            System.out.println("BinarySearch result:");
            System.out.println("Element found at key " + binaryResult);
        } else{
            System.out.println("NOT_FOUND");
        }
    }
}