import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        // Get the elements of the array from the user
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Get the target value to search for
        System.out.println();
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // Perform Linear Search
        int linearResult = Algorithms.linearSearch(array, target);

        // Perform Binary Search
        // Note: Binary search requires a sorted array, so we sort a copy
        // of the original array before searching, while keeping the
        // original array (and the linear search result) untouched.
        int[] sortedArray = array.clone();
        sortArray(sortedArray);
        int binaryResult = Algorithms.binarySearch(sortedArray, target);

        // Display the results
        System.out.println();
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println();
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }

    // Simple bubble sort, used so binarySearch can run on a sorted array
    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

