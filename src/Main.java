public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int target = 30;

        int result = Algorithms.linearSearch(array, target);

        System.out.println("Index found: " + result);
        int binaryResult = Algorithms.binarySearch(array, target);
        System.out.println("Binary Search Index: " + binaryResult);
    }
}