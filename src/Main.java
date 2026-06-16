import java.util.Scanner;
import java.util.Arrays;

public class Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        // Linear Search
        int linearIndex = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                linearIndex = i;
                break;
            }
        }

        if(linearIndex != -1) {
            System.out.println("Linear Search: Found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Not found");
        }

        // Binary Search
        Arrays.sort(arr);

        int low = 0;
        int high = n - 1;
        int binaryIndex = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                binaryIndex = mid;
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        if(binaryIndex != -1) {
            System.out.println("Binary Search: Found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Not found");
        }

        sc.close();
    }
}