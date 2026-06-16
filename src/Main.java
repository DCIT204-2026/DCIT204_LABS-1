import java.util.Arrays;import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        input.nextInt();

        System.out.println("Enter element 1: ");
        int element_1 = input.nextInt();
        System.out.println("Enter element 2: ");
        int element_2 = input.nextInt();
        System.out.println("Enter element 3: ");
        int element_3 = input.nextInt();
        System.out.println("Enter element 4: ");
        int element_4 = input.nextInt();
        System.out.println("Enter element 5: ");
        int element_5 = input.nextInt();

        System.out.println("Enter target value: ");
        int target_value = input.nextInt();

        int [] arr = {element_1, element_2, element_3, element_4, element_5};
        Arrays.sort(arr);

        System.out.println("Linear Search Result: " + "Target found at index " +
                Algorithms.LinearSearch(arr, target_value));

        System.out.println("Binary Search Result: " + "Target found at index " +
                Algorithms.BinarySearch(arr, target_value));
    }
}