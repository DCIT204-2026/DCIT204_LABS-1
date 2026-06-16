import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();

        int[] arrayInUse = new int[arraySize];
        

        for (int i = 0; i < arraySize; i++) {
        System.out.print("Enter the " + (i+1) + " number: ");
        int inputNumber = input.nextInt();
        arrayInUse[i] = inputNumber;
        }

        System.out.println("Enter target: ");
        int target = input.nextInt();
        input.close();
        
        int linearSearchResults = Algorithm1.linearSearch(arrayInUse, target);
        int binarySearchResults = Algorithm1.binarySearch(arrayInUse, target);

        if (linearSearchResults != -1){
            System.out.println("From Linear Search" + target + " was found on index: " + linearSearchResults);
        }
        else {
            System.out.println(target + " was not found in array");
        }

        if (binarySearchResults != -1){
            System.out.println("From Binary Search; "+ target + " was found on index: " + binarySearchResults);
        }
        else {
            System.out.println(target + " was not found in array");
        }
    }
}
