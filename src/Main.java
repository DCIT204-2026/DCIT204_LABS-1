import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         System.out.print("Enter element " + (var4 + 1) + ": ");
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter target value: ");
      var4 = var1.nextInt();
      int var5 = Algorithms.linearSearch(var3, var4);
      Arrays.sort(var3);
      int var6 = Algorithms.binarySearch(var3, var4);
      System.out.println("\nLinear Search Result:");
      if (var5 != -1) {
         System.out.println("Target found at index " + var5);
      } else {
         System.out.println("Target not found");
      }

      System.out.println("\nBinary Search Result:");
      if (var6 != -1) {
         System.out.println("Target found at index " + var6);
      } else {
         System.out.println("Target not found");
      }

      var1.close();
   }
    }
