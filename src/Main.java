import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the size of your array: ");
                int size = scanner.nextInt();
                int[] array = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element No. " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                }

                System.out.print("Enter the target value: ");
                int target = scanner.nextInt();


                int linearResult = Algorithms.linearSearch(array, target);
                System.out.println("\nLinear Search Result:");
                if (linearResult != -1) {
                    System.out.println("Target found at index " + linearResult);
                } else {
                    System.out.println("Target not found.");
                }

                Arrays.sort(array);
                int binaryResult = Algorithms.binarySearch(array, target);
                System.out.println("\nBinary Search Result (on sorted array):");
                if (binaryResult != -1) {
                    System.out.println("Target found at index " + binaryResult);
                } else {
                    System.out.println("Target not found.");
                }

                scanner.close();
            }
        }