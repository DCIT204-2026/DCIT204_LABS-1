import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO ENOCK SEARCHING ALGORITHM 😂😂");
        System.out.println("What SEARCH do you want to do ");
        System.out.println("1. Linear Search ");
        System.out.println("2. Binary Search ");

        int decision = input.nextInt();

        if(decision == 1){
            System.out.println("You want to do Linear Search");
            System.out.print("what is the size of the array: ");
            int arraySize = input.nextInt();

            int [] arr = new int[arraySize];

            for (int i =0 ; i < arraySize; i++){
                System.out.println("Enter Element " + (i+1) );
                arr[i] = input.nextInt();
            }

            Arrays.sort(arr);

            System.out.println("Enter the key");
            int key = input.nextInt();

            System.out.println("\n The array you entered :");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            int result = Algorithms.linearSearch(arr, key);

            if (result != -1){
                System.out.println("\n The number " + key + " can be found at index " + result + " of the array \n Thank you");
            }
            else {
                System.out.println("Not found");
            }

        } else if (decision == 2) {
            System.out.println("You want to do Binary Search");
            System.out.print("what is the size of the array: ");
            int arraySize = input.nextInt();

            int [] arr = new int[arraySize];

            for (int i =0 ; i < arraySize; i++){
                System.out.println("Enter Element " + (i+1) );
                arr[i] = input.nextInt();

            }
            Arrays.sort(arr);

            System.out.println("Enter the key");
            int key = input.nextInt();

            System.out.println("\n The array you entered :");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            int result = Algorithms.binarySearch(arr, key);

            if (result != -1){
                System.out.println("\n The number " + key + " can be found at index " + result + " of the array \n Thank you");
            }
            else {
                System.out.println("Not found");
            }
        }
        else {
            System.out.println("Invalid Input!!! TRY AGAIN");
        }

        input.close();
    }
}