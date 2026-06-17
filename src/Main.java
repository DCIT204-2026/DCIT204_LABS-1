import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++ ){
            System.out.print("Enter your element 3" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter your target value: ");
        int target = scanner.nextInt();
        
        int linearsearchResult = Algorithms.linearSearch(array, target);
        System.out.println("\nYour Linear Search Result:");

        if(linearsearchResult != -1){
            System.out.println("Your target is found at index" + linearsearchResult); 
        } else {
            System.out.println("Your taget not found");
        }

        Arrays.sort(array);

        int binarysearchResult = Algorithms.binarySearch(array, target);

        System.out.println("\nYour Binary Search Result:");

        if (binarysearchResult != -1) {
            System.out.println("Target found at index " + binarysearchResult);
        } else {
            System.out.println("Your target not found");
        }
        
        scanner.close();




    }
}