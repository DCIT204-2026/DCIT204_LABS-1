public class Main {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        // 1. Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];

        // 2. Get array elements
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Get target value
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        // 4. Perform and display Linear Search Results
        System.out.println("Linear Search Result:");
        int linearResult = Algorithm.linearSearch(array, target);
        printResult(linearResult);

        // 5. Binary Search Requirement: Array MUST be sorted
        // We sort a copy or the original array to guarantee correctness
        Arrays.sort(array); 
        System.out.println("\n(Note: Array has been sorted for Binary Search)");

        // 6. Perform and display Binary Search Results
        System.out.println("Binary Search Result:");
        int binaryResult = Algorithm.binarySearch(array, target);
        printResult(binaryResult);

        scanner.close();
    }

    /**
     * Helper method to cleanly format and display the search outcome.
     */
    private static void printResult(int index) {
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
