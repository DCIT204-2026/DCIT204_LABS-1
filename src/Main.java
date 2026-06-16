import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println();


        for (int i = 0; i < n; i++){
            System.out.print("Enter the element " + ( i + 1 ) + ": " );
            array[i] = input.nextInt();
        }
        System.out.println();

        System.out.print("Enter the target value: ");
        int target = input.nextInt();
        System.out.println();

        int results = Algorithms.linearSearch( array,target);
        System.out.println("Linear search results ");
        System.out.println("Target found at index: " + results);
        System.out.println();

        int result = Algorithms.binarySearch(array, target);
        System.out.println("Binary search results ");
        System.out.println("Target found at index: " + result);
        System.out.println();

        input.close();

      /* Enter the array size : 5

       Enter the element 1: 1
       Enter the element 2: 2
       Enter the element 3: 3
       Enter the element 4: 4
       Enter the element 5: 5

       Enter the target value: 3

       Linear search results
       Target found at index: 2

       Binary search results
       Target found at index: 2 */
    }
}