public class Main {
    public static void main(String[] args) {

        int[] arr1 = {5, 3, 8, 1, 9};
        int[] arr2 = {1, 3, 5, 7, 9};

        System.out.println("Linear Search: " +
                Algorithms.linearSearch(arr1, 8));

        System.out.println("Binary Search: " +
                Algorithms.binarySearch(arr2, 7));
    }
}