import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner arrayInput = new Scanner(System.in);
        
        // Linear Search
        System.out.println("Linear Search");
        
        System.out.print("Enter array length: ");
        int length1 = arrayInput.nextInt();
        
        int[] array1 = new int[length1];
        
        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < length1; i++) {
            array1[i] = arrayInput.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target1 = arrayInput.nextInt();
        
        int output1 = Algorithms.linearSearch(array1, target1);
        
        if (output1 == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + output1);
        }
        
        //Binary Search
        System.out.print("\nBinary Search");
        
        System.out.print("Enter array length: ");
        int length2 = arrayInput.nextInt();
        
        int[] array2 = new int[length2];
        
        System.out.println("Enter the array elements in sorted order:");
        
        for (int i = 0; i < length2; i++) {
            array2[i] = arrayInput.nextInt();
        }
        
        System.out.print("Enter te target value: ");
        int target2 = arrayInput.nextInt();
        
        int output2 = Algorithms.binarySearch(array2, target2);
        
        if (output2 == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + output2);
        }
        
        arrayInput.close();
    }
}