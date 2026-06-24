 import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = scr.nextInt();
        int[] arr = new int [x];
        int arraySize = x;
        System.out.println("Array size: " + arraySize);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = scr.nextInt();

        }    
       
        int result = Algorithms.LinearSearch(arr, 2);

        int result = Algorithms.BinarySearch(arr, 2);

        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        long duration = endTime -startTime;

        System.out.println("Duration" + duration + "nanoseconds");

        if(result != -1) {
            System.out.println("Element found at key " + result);
        }
        else {
            System.out.println("NOT FOUND");
        }



    }

}
