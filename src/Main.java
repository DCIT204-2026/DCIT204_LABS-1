import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //number of elements in array
    System.out.print("How many elements do you want in you array: ");
    int arrSize = input.nextInt();

    int[] createdArr = new int[arrSize];

    //input elements in array
    for(int i= 0; i< arrSize; i++){
        System.out.print("input element " + (i+1) + " : ");
        int arrInput = input.nextInt();
        createdArr[i] = arrInput;
    
    }
    System.out.print(java.util.Arrays.toString(createdArr));

    //Creating element to search for in array
    System.out.print("\n"+"What number are you searching for; ");
    int targetInt = input.nextInt();
    
    //calling linear Search
    int linearSearchResult = Algorithms.linearSearch(createdArr,targetInt);
    System.out.print("Linear Search Result: " + linearSearchResult + "\n");

    //calling Binary Search
    int[] sortedArray = createdArr.clone();
        Arrays.sort(sortedArray);

        int binarySearchResult = Algorithms.binarySearch(sortedArray, targetInt);

        System.out.println("Sorted array for Binary Search: "
                + Arrays.toString(sortedArray));

        if (binarySearchResult != -1) {
            System.out.println("Binary Search: Found at index "
                    + binarySearchResult + " in the sorted array.");
        } else {
            System.out.println("Binary Search: Number not found.");
        }
    System.out.print("Binary Search Result: " + binarySearchResult);

    input.close();
}


   
}
