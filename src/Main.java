public class Main {
    public static void main(String[] args) {
        import java.util.Arrays;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // 1. Get array size
                System.out.print("Enter array size: ");
                int size = input.nextInt();

                int[] array = new int[size];

                // 2. Get array elements
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    array[i] = input.nextInt();
                }

                // 3. Get target value
                System.out.print("Enter target value: ");
                int target = input.nextInt();

                // 4. Linear Search
                int linearResult = Algorithm.linearSearch(array, target);

                System.out.println("\nLinear Search Result:");
                if (linearResult != -1) {
                    System.out.println("Target found at index " + linearResult);
                } else {
                    System.out.println("Target not found");
                }

                // 5. Sort array for Binary Search (IMPORTANT requirement note)
                Arrays.sort(array);

                // 6. Binary Search
                int binaryResult = Algorithm.binarySearch(array, target);

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