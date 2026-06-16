public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        int linearResult = Algorithm.linearSearch(arr, target);
        System.out.println("\n--- Linear Search Result ---");
        if (linearResult != -1) {
            System.out.println("Target found at index: " + linearResult);
        } else {
            System.out.println("Target not found in the array.");
        }
        int[] sortedArr = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArr[i] = arr[i]; 

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }

        int binaryResult = Algorithm.binarySearch(sortedArr, target);
        System.out.println("\n--- Binary Search Result ---");
        System.out.println("(Note: The array was sorted internally for this search)");
        
        if (binaryResult != -1) {
            System.out.println("Target found at index: " + binaryResult);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
