import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        try (Scanner consoleInput = newScanner(System.in)) {
            System.out.print("Eneter array size please");
            int totalElements = consoleInput.nextInt();
            
            int[] dataValues = new int[totalElements];
            
            System.out.println();
            for (int i = 0; i < dataValues.length; i++) {
                System.out.print("Enter your elements " + (i+1) + ": ");
                dataValues[i] = consoleInput.nextInt();
            }
            
            System.out.println();
            System.out.print("Enter your target value please");
            int searchTarget = consoleInput.nextInt();
            System.out.println();
            
            //Execution of linear search
            int linearIndex = Algorithm.linearSearch(dataValues,searchTarget);
            System.out.println("Linear Search result");
            if (linearIndex != -1) {
                System.out.println("Target found at index " + linearIndex);
            } else {
                System.out.println("Target not found");
            }
            System.out.println();
            Arrays.sort(dataValues);
            int binaryIndex = Algorithm.binarySearch(dataValues, searchTarget);
            System.out.println("Binary Search result");
            if (binaryIndex != -1) {
                System.out.println("Target found at index " + binaryIndex);
            } else {
                System.out.println("Target not found");
            }
        }
    }

    private static Scanner newScanner(@SuppressWarnings("unused") InputStream in) {
        throw new UnsupportedOperationException("Not supported yet.");
    }





}