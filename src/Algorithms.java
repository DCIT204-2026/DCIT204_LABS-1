public class Algorithms {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }
        return -1; // not found

    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }

}
//awal is the best i goon to him every night and seyram too goons to him but im shy to tell him


//import java.util.Scanner;
//import java.util.Arrays;
//
//            public class Main {
//
//                // Linear Search
//                //public static int linearSearch(int[] arr, int target) {
//
//                //}
//
//
//                // Binary Search (array must be sorted)
//                //public static int binarySearch(int[] arr, int target) {
//
//                //}
//
//
//                public static void main(String[] args) {
//
//                    Scanner input = new Scanner(System.in);
//
//                    System.out.print("Enter array size: ");
//                    int size = input.nextInt();
//
//                    int[] numbers = new int[size];
//
//                    System.out.println("Enter array elements:");
//                    for (int i = 0; i < size; i++) {
//                        numbers[i] = input.nextInt();
//                    }
//
//                    System.out.print("Enter target value: ");
//                    int target = input.nextInt();
//
//
//                    // Linear Search
//                    int linearResult = linearSearch(numbers, target);
//
//                    System.out.println("\nLinear Search:");
//                    if (linearResult == -1) {
//                        System.out.println("Target not found");
//                    } else {
//                        System.out.println("Target found at index " + linearResult);
//                    }
//
//
//                    // Sort copy for Binary Search
//                    int[] sortedArray = numbers.clone();
//                    Arrays.sort(sortedArray);
//
//                    int binaryResult = binarySearch(sortedArray, target);
//
//                    System.out.println("\nBinary Search:");
//                    if (binaryResult == -1) {
//                        System.out.println("Target not found");
//                    } else {
//                        System.out.println("Target found at index " + binaryResult);
//                    }
//
//
//                    input.close();
//                }
//            }