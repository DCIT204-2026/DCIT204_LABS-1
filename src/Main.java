import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter array size: ");
       int size = scanner.nextInt();


       int[] array = new int[size];
       for(int i = 0; i < size; i++){
           System.out.print("Enter array element " + (i+1)+ ": ");
           array[i] = scanner.nextInt();
       }

       System.out.print("\nEnter target value: ");
       int target = scanner.nextInt();

       int linearResult = Algorithms.binarySearch(array, target);

       Arrays.sort(array);
       int binaryResult = Algorithms.binarySearch(array, target);

       System.out.println("\nLinear search result: ");
       if (linearResult != -1)
           System.out.println("Target found at index: " + linearResult);

       else
           System.out.println("Target not found");

       System.out.println("\nBinary search result: ");
       if (binaryResult != -1)
           System.out.println("Target found at index: " + binaryResult);
       else
           System.out.println("Target not found");

       scanner.close();


    }
}