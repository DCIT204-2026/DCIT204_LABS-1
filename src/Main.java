import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        // Linear Search
        System.out.println("Linear Search");

        System.out.print("Enter array size: ");
        int size1 = info.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size1; i++) {
            arr1[i] = info.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target1 = info.nextInt();

        int result1 = Algorithm.linearSearch(arr1, target1);

        if (result1 == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + result1);
        }

        //Binary Search
        System.out.print("\nBinary Search");

        System.out.print("Enter array size: ");
        int size2 = info.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter the array elements in sorted order:");

        for (int i = 0; i < size2; i++) {
            arr2[i] = info.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target2 = info.nextInt();

        int result2 = Algorithm.binarySearch(arr2, target2);

        if (result2 == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + result2);
        }

        info.close();
    }
}