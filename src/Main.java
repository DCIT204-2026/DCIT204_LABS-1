import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args ) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = input.nextInt();

            int[] arr = new int[size];

            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter the element " + (i+1) + ": ");
                arr[i]= input.nextInt();
            }
            System.out.print("Enter the target value to search for(key): ");
            int target = input.nextInt();


            //Linear Search
        int LinearIndex = Algorithms.LinearSearch(arr, target);
        System.out.println("Linear Search Result" );

        if (LinearIndex == -1) {
            System.out.println("target" + target + "found at index " + LinearIndex);
        }
          else{
                System.out.println("target" + target + " was not found");
          }

          //Binary Search
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);

        System.out.print("Sorted Array: ");
        int binaryIndex = Algorithms.BinarySearch(sortedArray, target);

        if (binaryIndex == -1) {
            System.out.println("target" + target + "found at index " + binaryIndex);
        }
        else{
            System.out.println("target" + target + " was not found");
        }

        System.out.print("Search complete");

        input.close();
    }
}
