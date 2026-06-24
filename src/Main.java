import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];


        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(array, target);


        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryResult = Algorithm.binarySearch(sortedArray, target);


        System.out.println("\n--- Linear Search ---");
        if (linearResult != -1) {
            System.out.println("Found at index: " + linearResult);
        } else {
            System.out.println("Not found");
        }

        System.out.println("\n--- Binary Search (on sorted array) ---");
        if (binaryResult != -1) {
            System.out.println("Found at index: " + binaryResult);
        } else {
            System.out.println("Not found");
        }
    }
}