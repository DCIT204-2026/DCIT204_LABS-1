import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int input(String prompt) {
        System.out.println(prompt);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    public static int[] input(String prompt, int n) {
        System.out.println(prompt);
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Element " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid. Enter an integer: ");
                    scanner.next();
                }
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            return arr;
        }
        
    }
    
    public static void main(String[] args) {

        int n = input("Enter Array Size");
        int target = input("Enter Target");
        int[] array = input("Enter Elements...", n);
        
        int linearSearchResult = Algorithms.linearSearch(n, array, target);
        int binarySearchResult = Algorithms.binarySearch(n, array, target);

        System.out.println("Linear Result" + linearSearchResult);
        System.out.println("Binary Result" + binarySearchResult);
        
    }

}
