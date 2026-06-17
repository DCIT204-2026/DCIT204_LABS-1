import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter your preferred size for the array: ");
        int n = scan.nextInt();
        for (int i = 0; i <n; i++){
            System.out.printf("Enter element %d: %n", i+1);
            arr.add(scan.nextInt());
        }
        System.out.println();


        System.out.println(arr.toString());
        System.out.println("Enter the target element you want to find: ");
        int target = scan.nextInt();
        System.out.println();

        int linearSearchResult = Algorithms.linearSearch(arr, target);
        System.out.println("The target element using Linear Search is found at index: " + linearSearchResult);
        System.out.println();


        ArrayList<Integer>sortedArr = new ArrayList<>(arr);
        sortedArr.sort(null);
        int binarySearchResult = Algorithms.binarySearch(sortedArr, target);
        System.out.println("The target element using Binary Search is found at index: " + binarySearchResult);
        scan.close();
    }
}

