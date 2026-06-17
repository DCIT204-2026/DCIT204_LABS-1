import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int[] values = {5,10,17,27,30,38};
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number you want to look  for: ");
        int key = input.nextInt();

        int linearOutcome = Algorithms.linearSearch(values, key);
        int binaryOutcome = Algorithms.binarySearch(values, key);

        System.out.println("Linear Search outcome (index): " + linearOutcome);
        System.out.println("Binary Search outcome (index): " + binaryOutcome);

        input.close();
    }
}

