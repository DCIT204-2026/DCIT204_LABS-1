public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
 
        int[] array = new int[size];
 
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
 
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();
 
        int linearResult = Algorithm.linearSearch(array, target);
 
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found in the array");
        }
 
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
 
        int binaryResult = Algorithm.binarySearch(sortedArray, target);
 
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found in the array");
        }
 
        scanner.close();
    }
 
}
