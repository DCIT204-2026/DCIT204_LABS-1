public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine().trim());
 
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine().trim());
        }
 
        System.out.print("Enter target value: ");
        int target = Integer.parseInt(scanner.nextLine().trim());
 
        int linearResult = Algorithm.linearSearch(array, target);
 
        int[] sortedArray = array.clone();
        java.util.Arrays.sort(sortedArray);
        int binaryResult = Algorithm.binarySearch(sortedArray, target);
 
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
 
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }
 
        scanner.close();
    }
}
