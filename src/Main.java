import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();
        int[] array = new int[size];


        System.out.println("Enter the elements of the array :");
        for (int i=0; i<size; i++){
            System.out.println("Enter element " + i + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter target value : ");
        int target = scanner.nextInt();

        //LINEAR SEARCH
        System.out.println("Linear search results :");
        int linearSearchResult = Algorithms.linearSearch(array,target);
        if (linearSearchResult != -1 ){
            System.out.println("Target found at index"+ linearSearchResult +":");
        }
        else{
            System.out.println("Target not found");
        }

        //BINARY SEARCH.
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        System.out.println("Binary search results :");
        int binarySearchResult = Algorithms.binarySearch(sortedArray,target);

        if (binarySearchResult != -1 ){
            System.out.println("Target found at index"+ binarySearchResult +" h1:");
        }
        else{
            System.out.println("Target not found");
        }

        scanner.close();
    }


}