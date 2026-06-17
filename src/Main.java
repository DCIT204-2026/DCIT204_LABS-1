//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final String ORANGE = "\u001b[38;5;208m";
    public static final String RESET = "\u001b[0m";
    public static final String RED = "\u001b[31m";
    public static final String BLUE = "\u001b[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        System.out.println("\u001b[34mPress The Enter Key after typing each number\u001b[0m");
        System.out.println("Input the members of your array:");

        for(int i = 0; i < size; ++i) {
            System.out.print("Element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Enter your target value:");
        int target = scanner.nextInt();
        int linearIndex = Algorithms.linearSearch(array, target);
        System.out.println("The linear Search result is");
        if (linearIndex != -1) {
            System.out.println("Your target value was found at index:\u001b[38;5;208m" + linearIndex + "\u001b[0m");
        } else {
            System.out.println("\u001b[31mNOT FOUND\u001b[0m");
        }

        Arrays.sort(array);
        int binaryIndex = Algorithms.binarySearch(array, target);
        System.out.println("The binary search result is");
        if (binaryIndex != -1) {
            System.out.println("Your target value was found at index:\u001b[38;5;208m" + binaryIndex + "\u001b[0m");
        } else {
            System.out.println("\u001b[31mNOT FOUND\u001b[0m");
        }

        scanner.close();
    }
}
