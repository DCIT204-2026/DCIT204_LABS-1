public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Get array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Get target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();

        // Linear Search
        int linearIndex = linearSearch(arr, target);

        if (linearIndex != -1) {
            System.out.println("\nLinear Search:");
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("\nLinear Search:");
            System.out.println("Target not found.");
        }

        // Sort array for Binary Search
        Arrays.sort(arr);

        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        // Binary Search
        int binaryIndex = binarySearch(arr, target);

        if (binaryIndex != -1) {
            System.out.println("\nBinary Search:");
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("\nBinary Search:");
            System.out.println("Target not found.");
        }

        input.close();
    }
}
    }
}
