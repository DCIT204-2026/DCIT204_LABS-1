public class Main {
    public static void main(String[] args) {
import java.util.Arrays;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Array size
                System.out.print("Enter array size: ");
                int size = input.nextInt();

                int[] numbers = new int[size];

                // Array elements
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                }

                // Target value
                System.out.print("Enter target value: ");
                int target = input.nextInt();

                // Linear Search
                int linearResult = Algorithm.linearSearch(numbers, target);

                System.out.println("\nLinear Search Result:");

                if (linearResult != -1) {
                    System.out.println("Target found at index " + linearResult);
                } else {
                    System.out.println("Target not found");
                }

                // Sort array for Binary Search
                Arrays.sort(numbers);

                // Binary Search
                int binaryResult = Algorithm.binarySearch(numbers, target);

                System.out.println("\nBinary Search Result:");

                if (binaryResult != -1) {
                    System.out.println("Target found at index " + binaryResult);
                } else {
                    System.out.println("Target not found");
                }

                input.close();
            }
        }
    }
}