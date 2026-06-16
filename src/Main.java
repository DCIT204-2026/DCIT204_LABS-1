import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arrlength = scanner.nextInt();

        int[] arrBeingUsed = new int[arrlength];
        

        for (int i = 0; i < arrlength; i++) {
        System.out.print("Enter the number: ");
        int inputtedNum = scanner.nextInt();
        arrBeingUsed[i] = inputtedNum;
        }

        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        scanner.close();
        
        int linearSearchResults = Algorithm.linearSearch(arrBeingUsed, target);
        int binarySearchResults = Algorithm.binarySearch(arrBeingUsed, target);

        if (linearSearchResults != -1){
            System.out.println("From Linear Search, index: " + linearSearchResults + "contains the target.");
        }
        else {
            System.out.println(target + " was not found in array");
        }

        if (binarySearchResults != -1){
            System.out.println("From Binary Search, index: " + binarySearchResults + "contains the targret");
        }
        else {
            System.out.println(target + " was not found in array");
        }
    }
}
