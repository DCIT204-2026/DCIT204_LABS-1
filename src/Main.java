import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = userInput.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array in an ascending order: ");
        for (int i = 0; i < size; i++){
            System.out.print("Element at index " + i + ": ");
            array[i] = userInput.nextInt();
        }
        System.out.print("Enter the value to search for: ");
        int value = userInput.nextInt();
        System.out.println("Searching for " + value + " in the array...");
            linear search
        int linearIndex = Algorithms.linearSearch(array, value);
        if (linearIndex != -1){
            System.out.println("Linear search results: ");
            System.out.println("Found at index: " + linearIndex);
        }else{
            System.out.println("Linear search results: ");
            System.out.println("Not found ");
        }
            // binary search
        int binaryIndex = Algorithms.binarySearch(array, value);
        if (binaryIndex != -1){
            System.out.println("Binary search results: ");
            System.out.println("Found at index: " + binaryIndex);
        }else{
            System.out.println("Binary search results: ");
            System.out.println("Not found");
        }
        userInput.close();
    } 
}
