import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] elements = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            elements[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        int targetValue = input.nextInt();

        int linearResult = Algorithms.linearSearch(elements, targetValue);
        if(linearResult != -1){
            System.out.println("Linear Search Result:");
            System.out.println(targetValue + " found at index " + linearResult);
        }
        else{
            System.out.println("Linear Search Result:");
            System.out.println(targetValue + " NOT found!");
        }

        Arrays.sort(elements);
        
        int binaryResult = Algorithms.binarySearch(elements, targetValue);
        if(binaryResult != -1){
            System.out.println("Binary Search Result:");
            System.out.println(targetValue + " found at index " + binaryResult);
        }
        else{
            System.out.println("Binary Search Result:");
            System.out.println(targetValue + " NOT found!");
        }

        input.close();
    }
}