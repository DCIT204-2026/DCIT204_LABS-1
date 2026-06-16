public class Main {
    public static void main(String[] 

        // 1. Enter size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // 2. Create array
        int[] arr = new int[size];

        // 3. Enter elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // 4. Enter target
        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();

        // 5. Linear Search
        int linearResult = Algorithm.linearSearch(arr, target);

        // 6. Sort before Binary Search
        Arrays.sort(arr);

        // 7. Binary Search
        int binaryResult = Algorithm.binarySearch(arr, target);

        // 8. Display results
        System.out.println("\n--- Results ---");

        if (linearResult != -1) {
            System.out.println("Linear Search: Found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Not found");
        }

        if (binaryResult != -1) {
            System.out.println("Binary Search: Found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Not found");
        }

        input.close();
    }
}