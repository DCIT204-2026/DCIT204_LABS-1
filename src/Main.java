import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            int [] input = new int[size];

            System.out.println("Enter the array elements: ");
            for(int i=0;i< size;i++){
                input[i] = scanner.nextInt();

            }
            Arrays.sort(input);

            System.out.println("Enter the number to search for: ");
            int key = scanner.nextInt();

            int result = Algorithms.linearSearch(input,key);
            System.out.println("Linear Search Result: ");
            if (result != -1 ){
                System.out.println("Target found at index " + result);
            }else {
                System.out.println("Target not found");
            }

            int result2 = Algorithms.binarySearch(input,key);
            System.out.println("Binary Search Result: ");
            if (result2 != -1 ){
                System.out.println("Target found at index " + result2);
            }else {
                System.out.println("Target not found");
            }
    }
}