import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[size];

        System.out.printf("Enter %d elements to be inserted into the Array \n", size);
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target or key value to search for: ");
        int target = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nSEARCH RESULTS ");

        int linearSearchResult = Algorithm.linearSearch(array, target);
        displayResult("Linear Search", linearSearchResult);

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        if (!Arrays.equals(array, sortedArray)) {
            // Added space before and after the array output string
            System.out.println("\nArray was successfully sorted to " + Arrays.toString(sortedArray) + " for Binary Search");
        }

        int binarySearchResult = Algorithm.binarySearch(sortedArray, target);
        displayResult("Binary Search", binarySearchResult);

        scanner.close();
    }

    public static void displayResult(String searchType, int index) {
        System.out.println("[" + searchType + "]");
        if (index != -1) {
            System.out.println("Target Found");
            System.out.println("Index position: " + index); // Fixed spelling of "position"
        } else {
            System.out.println("Target Not Found");
        }
    }
}
