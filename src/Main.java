import java.util.Scanner;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get array size from user
        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();
        int [] arr = new int[size];

        // input array elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = intput.nextInt();
        }

        // element to search
        System.out.print("Enter the element to search: ");
        int searchValue = input.nextInt();

        // Linear Search
        int linearResult = Algorithms.linearSearch(arr, searchValue);
        System.out.println("\nLinear Search result:");

        if (linearResult != -1) {
            System.out.println("\nTarget found at index " + linearResut);
        } else {
            System.out.println("\nTarget not found");
        }

        // binary search
        Array.sort(arr);
        
        int binaryResult = Algorithms.binarySearch(arr, searchValue);
        System.out.println("\nBinary search Result:");
        if (binaryResult != -1) {
            System.out.println("\nTarget found at index" + binaryResult);
        } else {
            System.out.println("\nTarget not found");
        }

        input.close();

    }
}