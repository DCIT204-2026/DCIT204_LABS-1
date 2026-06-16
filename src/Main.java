import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable declaration
        int listSize;
        int resLinearS;
        int resBinaryS;
        int toFind;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        ArrayList<Integer> sortedUserInput = new ArrayList<Integer>();

        // Welcome message
        System.out.println("Welcome to Java Search!\n");

        // User input
        System.out.print("Enter array size: ");
        listSize = input.nextInt();

        System.out.print("\nInput the elements of the list...\n");
        for (int i = 1; i <= listSize; i++) {
            System.out.print("\nEnter element " + i + ": ");
            userInput.add(input.nextInt());
        }

        sortedUserInput.addAll(userInput);
        Collections.sort(sortedUserInput);

        System.out.print("\nWhat are you looking for?: ");
        toFind = input.nextInt();

        // Call Linear Search
        resLinearS = Algorithms.linearSearch(userInput, toFind);
        
        // Call Binary Search
        resBinaryS = Algorithms.binarySearch(sortedUserInput, toFind);

        // Display results
        if (resLinearS == -1) {
            System.out.println("\nTarget not found!");
        } else {
            System.out.println("\nLinear Search Result: ");
            System.out.println("Target found at index " + resLinearS);

            System.out.println("\nBinary Search Result: ");
            System.out.println("Target found at index " + resBinaryS);
        }

        input.close();
    }
}