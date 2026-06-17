import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            System.out.println("Enter Element" + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Enter target value: ");
        int targetValue = scanner.nextInt();

        int linearSearchResult = Algorithms.linearSearch(array, targetValue);
        int binarySearchResult = Algorithms.binarySearch(array, targetValue);


        if (linearSearchResult != -1){
            System.out.println("Target found at index " + linearSearchResult);
        }
        else{
            System.out.println("Target not found");
        }

        if (binarySearchResult != -1){
            System.out.println("Target found at index " + binarySearchResult);
        }
        else{
            System.out.println("Target not found");
        }
    }
}