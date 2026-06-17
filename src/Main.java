

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Get array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();


        int[] numbers = new int[size];


        // Get array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }


        // Get target value
        System.out.print("Enter the target value to search for: ");
        int target = input.nextInt();



        // Linear Search
        int linearResult = Algorithm.linearSearch(numbers, target);


        System.out.println("\n--- Linear Search Result ---");

        if (linearResult != -1) {

            System.out.println("Target found");
            System.out.println("Index position: " + linearResult);

        } else {

            System.out.println("Target not found");
        }




        // Sort array before Binary Search
        Arrays.sort(numbers);


        // Binary Search
        int binaryResult = Algorithm.binarySearch(numbers, target);



        System.out.println("\n--- Binary Search Result ---");

        if (binaryResult != -1) {

            System.out.println("Target found");
            System.out.println("Index position: " + binaryResult);

        } else {

            System.out.println("Target not found");
        }


        input.close();

    }
}
