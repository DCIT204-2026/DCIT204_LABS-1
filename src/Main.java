public class Main {

    public static void testLinearSearchFound() {
        int[] arr = {4, 8, 15, 16, 23, 42};

        int result = Algorithms.linearSearch(arr, 23);

        System.out.println("Expected: 4");
        System.out.println("Actual: " + result);
    }

    public static void testBinarySearchFound() {
        int[] arr = {4, 8, 15, 16, 23, 42};

        int result = Algorithms.binarySearch(arr, 15);

        System.out.println("Expected: 2");
        System.out.println("Actual: " + result);
    }

     public static void main(String[] args) {
        testLinearSearchFound();

         testBinarySearchFound();



    }
}