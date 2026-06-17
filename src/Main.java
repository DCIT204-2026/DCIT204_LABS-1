import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
  
        //LINEAR SEARCH

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
           
        }

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        int index = Algorithm.linearSearch(arr, target);

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        


       //Binary Search
        Scanner scanner2 = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements (positive integer): ");
            int k = scanner2.nextInt();
            if (k <= 0) {
                System.out.println("Number of elements must be a positive integer.");
                return;
            }

            int[] arr_ = new int[k];
            System.out.println("Enter " + k + " non-negative integers (space or newline separated):");
            for (int i = 0; i < k; i++) {
                int value = scanner2.nextInt();
                if (value < 0) {
                    throw new IllegalArgumentException("Negative input not allowed: " + value);
                }
                arr_[i] = value;
            }

            System.out.print("Enter target value (non-negative integer): ");
            int target_ = scanner2.nextInt();
            if (target_ < 0) {
                throw new IllegalArgumentException("Negative target not allowed: " + target_);
            }

            // Ensure array is sorted before running binary search
            Arrays.sort(arr_);
            

            // Call the binary search method from main
            int index_ = Algorithm.binarySearch(arr_, target_);

            if (index_ >= 0) {
                System.out.println("Target " + target_ + " found at index : " + index_);
            } else {
                System.out.println("Target " + target_ + " not found in the array.");
            }

        } catch (InputMismatchException ime) {
            System.out.println("Invalid input type. Please enter integers only.");
        } catch (IllegalArgumentException iae) {
            System.out.println("Input error: " + iae.getMessage());
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } finally {
            scanner2.close();
        }
    }
}
        
     