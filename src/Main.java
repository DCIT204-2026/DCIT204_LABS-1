public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.print("Enter target value: ");
        int target = Integer.parseInt(scanner.nextLine().trim());

        // Linear Search
        int linearIndex = Algorithms.linearSearch(arr, target);
        System.out.println();
        System.out.println("Linear Search Result:");
        if (linearIndex >= 0) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found");
        }

        // Binary Search -- requires sorted array
        int[] sorted = Algorithms.sortedCopy(arr);
        int binaryIndex = Algorithms.binarySearch(sorted, target);
        System.out.println();
        System.out.println("Binary Search Result (on sorted array):");
        if (binaryIndex >= 0) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}