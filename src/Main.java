class Main {
    public static void main(String[] args) {
        // Collect array size from the user
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(System.console().readLine());

        int[] array = new int[size];

        // Collect array elements from the user, inserting each one
        // into its correct sorted position as it's entered.
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = Integer.parseInt(System.console().readLine());
            count = Algorithm.insertSorted(array, count, value);
        }

        // Show the array in its sorted order, with each element's index
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }

        // Collect the target value to search for
        System.out.print("Enter target value: ");
        int target = Integer.parseInt(System.console().readLine());

        // Perform Linear Search
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        // Perform Binary Search
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        // scanner.close();
    }
}
