import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total number of elements or array size: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Please enter the numbers in sorted order for Binary Search.");

        System.out.println("Enter the elements in array:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter your target value: ");
        int target = input.nextInt();

        int linearResult = Algorithms.linearSearch(numbers, target);
        int binaryResult = Algorithms.binarySearch(numbers, target);
        
        if(linearResult==-1)
            
            System.out.println("Number not found in linear search");
        else
            System.out.println("Linear Search Result: " + linearResult);

        if(binaryResult == -1)
            System.out.println("Number not found in binary search");
        else
            System.out.println("Binary Search Result: " + binaryResult);

        input.close();
    }
}

    
