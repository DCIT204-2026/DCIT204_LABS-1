import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers:");

        int i = 0;
        for(i=0;i<size;i++){
            System.out.print("Enter element "+ (i+1)+": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithms.linearSearch(array,target);

        System.out.print("\nLinear Search Result: ");

        if(linearResult != -1){
            System.out.println("target found at index= " + linearResult);
        }
        else{
            System.out.println("target not found");
        }

        int binaryResult = Algorithms.binarySearch(array,target);
        System.out.println("\n Binary Search Result: ");

        Arrays.sort(array);
        if(binaryResult != -1){
            System.out.println("target found at index = " + binaryResult);
        }
        else{
            System.out.println("target not found");

        }


        scanner.close();
    }
}