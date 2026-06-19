import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size:  "); // print keeps cursor on same line
        int arraySize = input.nextInt();

        System.out.println("\n");

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= arraySize; i++) {
            System.out.print("Enter element " + i + ":   "); // value appears beside
            int element = input.nextInt();
            array.add(element);
        }

        System.out.println("\n");

        System.out.print("Enter target value:  ");
        int target = input.nextInt();

        System.out.println("\n");

        // convert to int[]
        int[] arr = array.stream().mapToInt(Integer::intValue).toArray();

        // linear search
        int linearSearch = Algorithms.linearSearch(arr, target);
        if (linearSearch != -1) {
            System.out.println("Linear Search Result:");
            System.out.println("Target found at index " + linearSearch);
        } else {
            System.out.println("Target not found.");
        }

        System.out.println("\n");

        // sort first, then binary search
        Collections.sort(array);
        int[] sortedArr = array.stream().mapToInt(Integer::intValue).toArray();

        // binary search
        int binarySearch = Algorithms.binarySearch(sortedArr, target);
        if (binarySearch != -1) {
            System.out.println("Binary Search Result:");
            System.out.println("Target found at index " + binarySearch);
        } else {
            System.out.println("Target not found.");
        }

        input.close(); // done, close scanner
    }
}