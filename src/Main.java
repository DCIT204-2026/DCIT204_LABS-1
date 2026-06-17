import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your preferred size for the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of your array:");
        for (int i = 0; i < size; i++){
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value you want to search for: ");
        int target = scanner.nextInt();
        //Clear the following after testing
        int iterations = 10000;

        long linearStart = System.nanoTime();
        int linearIndex = -1;
        for (int iter = 0; iter < iterations; iter++){
            linearIndex = linearSearch(array, target);

        }
        long linearEnd = System.nanoTime();
        long linearAvg = (linearEnd - linearStart) / iterations;
        
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        //Clear the following after testing
        long binaryStart = System.nanoTime();
        int binaryIndex = -1;
        for (int iter = 0; iter < iterations; iter++) {
            binaryIndex = binarySearch(sortedArray, target);
        }
        long binaryEnd = System.nanoTime();
        long binaryAvgTime = (binaryEnd - binaryStart) / iterations;

        // === Display Results ===
        System.out.println("\n Search Results");
        System.out.println("Original Array: " + Arrays.toString(array));

        if (linearIndex != -1) {
            System.out.println(" Linear Search: Target " + target + " FOUND at index " + linearIndex + " in the original array.");
        } else {
            System.out.println(" Linear Search: Target " + target + " NOT FOUND.");
        }

        if (binaryIndex != -1) {
            System.out.println(" Binary Search: Target " + target + " FOUND at index " + binaryIndex + " in the SORTED array.");
        } else {
            System.out.println(" Binary Search: Target " + target + " NOT FOUND.");
        }
        System.out.println("\n Performance Metrics ");
        System.out.println("Average Linear Search Time : " + linearAvg + " nanoseconds");
        System.out.println("Average Binary Search Time : " + binaryAvgTime + " nanoseconds");
        System.out.println("Array memory usage         : ~" + (size * 4L) + " bytes");

        scanner.close();
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}