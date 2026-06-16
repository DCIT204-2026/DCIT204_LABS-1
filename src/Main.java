import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i]  = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(arr, value);

        Arrays.sort(arr);

        int binaryResult = Algorithms.binarySearch(arr, value);

        System.out.println("\nLinear Search:");
        if (linearResult != -1){
            System.out.println("The value is found at index: " + linearResult);
        } else{
            System.out.println("Value not found!");
        }

        System.out.println("\nBinary Search:");
        if (binaryResult != -1){
            System.out.println("The value is found at index: " + binaryResult);
        } else{
            System.out.println("Value not found!");
        }

        scanner.close();
    }
}