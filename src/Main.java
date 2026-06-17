public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = input.nextInt();

        int linearResult = Algorithm.linearSearch(arr, target);
        int binaryResult = Algorithm.binarySearch(arr, target);

        System.out.println("\nResults:");

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