import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter array size:");
            int Size = scanner.nextInt();

            int [] arr = new int[Size];
            for (int i = 0;  i < Size; i++) {
                System.out.println("Enter element " + (i+1) + ":");
                arr[i] = scanner.nextInt();
            }

            System.out.println("Enter target to search");
            int target = scanner.nextInt();
            
            int LinearResult = Algorithms.linearSearch(arr, target);
            System.out.println("Linear Search result:"); 
                if ( LinearResult != -1) {
                    System.out.println("Target found at index "+ LinearResult);
                }
                else {
                    System.out.println("Target not found");
                }

                int[] sortedArray = Arrays.copyOf(arr, arr.length);
                Arrays.sort(sortedArray);


                int BinaryResult = Algorithms.binarySearch(sortedArray, target);
                System.out.println("Binary Search result:");
                if (BinaryResult != -1) {
                    System.out.println("Target found at index "+ BinaryResult);
                }

                else {
                    System.out.println("Target not found");
                }

                scanner.close();
        }

    }
