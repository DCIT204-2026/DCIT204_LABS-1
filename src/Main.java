import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int n = scanner.nextInt();

        int[] arr  = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i < n; i ++){
            arr[i] = scanner.nextInt();

        }

        System.out.println("Enter element to search for:");
        int target = scanner.nextInt();

        int result = Algorithms.linearsearch(arr , target);
        if (result != -1){
            System.out.println("Element index found at index " + result);
        }
        else{
            System.out.println("Element not found in the array.");
        }

        Arrays.sort(arr);
        System.out.println("\nArray sorted for binarysearch :" + Arrays.toString(arr));

        int binaryresult = Algorithms.binarysearch(arr , target);
        System.out.println("Binary search result");
        if(binaryresult != -1){
            System.out.println("Element found at sorted index " + binaryresult);
        }
        else{
            System.out.println("Element not found");
        }
        scanner.close();

    }


}