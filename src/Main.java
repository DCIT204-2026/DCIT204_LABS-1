import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);


        System.out.println("Enter target value:");
        int targetValue = scanner.nextInt();



        int linearSearchResult = Algorithms.linearSearch(array, targetValue);
        int binarySearchResult = Algorithms.binarySearch(array, targetValue);


        if (linearSearchResult != -1){
            System.out.println("Element found at index " + linearSearchResult);
        }
        else{
            System.out.println("Element Not Found");
        }

        if(binarySearchResult != -1){
            System.out.println("Element found at index " + binarySearchResult);
        }
        else{
            System.out.println("Element Not Found");
        }
    }




}