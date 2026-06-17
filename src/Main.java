import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DCIT 204 Lab 1 — Searching Algorithms Demo
 *
 * Demonstrates Linear Search and Binary Search with user interaction.
 * The user enters an array of numbers, chooses a search algorithm,
 * and enters a target value to find.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("   DCIT 204 Lab 1 — Searching Algorithms  ");
        System.out.println("===========================================\n");

        // ── Step 1: Get array size ──────────────────────────────────────────
        int size = 0;
        while (size <= 0) {
            System.out.print("Enter the number of elements in the array: ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("  Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("  Invalid input. Please enter a whole number.");
                scanner.nextLine(); // discard bad input
            }
        }

        // ── Step 2: Fill the array ──────────────────────────────────────────
        int[] array = new int[size];
        System.out.println("\nEnter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("  Element [" + i + "]: ");
                try {
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("  Invalid input. Please enter a whole number.");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("\nYour array: " + Arrays.toString(array));

        // ── Step 3: Choose algorithm ────────────────────────────────────────
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.println("\nChoose a search algorithm:");
            System.out.println("  1. Linear Search  — works on any array");
            System.out.println("  2. Binary Search  — requires a sorted array");
            System.out.print("Enter 1 or 2: ");
            try {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("  Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("  Invalid input. Please enter 1 or 2.");
                scanner.nextLine();
            }
        }

        // ── Step 4: Get the target ──────────────────────────────────────────
        System.out.print("\nEnter the value to search for: ");
        int target = 0;
        while (true) {
            try {
                target = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("  Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }

        // ── Step 5: Run the chosen algorithm ───────────────────────────────
        int result;
        System.out.println();

        if (choice == 1) {
            System.out.println("Running Linear Search for " + target + "...");
            result = LinearSearch.linearSearch(array, target);
        } else {
            // Binary search requires a sorted array — sort a copy so the
            // original order is preserved for the result message.
            int[] sorted = Arrays.copyOf(array, array.length);
            Arrays.sort(sorted);
            System.out.println("Sorting array for Binary Search: " + Arrays.toString(sorted));
            result = BinarySearch.binarySearch(sorted, target);
        }

        // ── Step 6: Display the result ──────────────────────────────────────
        System.out.println("-------------------------------------------");
        if (result != -1) {
            System.out.println("Result: " + target + " found at index " + result + ".");
        } else {
            System.out.println("Result: " + target + " was not found in the array.");
        }
        System.out.println("===========================================");

        scanner.close();
    }
}