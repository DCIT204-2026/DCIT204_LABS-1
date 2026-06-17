[1mdiff --git a/src/Algorithms.java b/src/Algorithms.java[m
[1mindex f6b1f8c..920e237 100644[m
[1m--- a/src/Algorithms.java[m
[1m+++ b/src/Algorithms.java[m
[36m@@ -1,2 +1,30 @@[m
 public class Algorithms {[m
[32m+[m[32m  public static int linearSearch(int[] array, int target){[m
[32m+[m[32m      for (int i = 0; i< array.length; i++){[m
[32m+[m[32m          if (array[i]== target){[m
[32m+[m[32m              return i;[m
[32m+[m[32m          }[m
[32m+[m[32m      }[m
[32m+[m[32m      return -1;[m
[32m+[m
[32m+[m
[32m+[m[32m  }[m
[32m+[m
[32m+[m[32m  public static int binarySearch(int[] array, int target){[m
[32m+[m[32m      int left = 0;[m
[32m+[m[32m      int right = array.length -1;[m
[32m+[m[32m      while (left <= right) {[m
[32m+[m[32m          int mid = left + ( right -left)/2;[m
[32m+[m
[32m+[m[32m          if (array[mid] == target){[m
[32m+[m[32m              return mid;[m
[32m+[m[32m          } else if (array[mid] < target) {[m
[32m+[m[32m              left = mid + 1;[m
[32m+[m[32m          }else {[m
[32m+[m[32m              right = mid -1;[m
[32m+[m[32m          }[m
[32m+[m[32m      }[m
[32m+[m
[32m+[m[32m      return -1;[m
[32m+[m[32m  }[m
 }[m
[1mdiff --git a/src/Main.java b/src/Main.java[m
[1mindex f5858db..7075c98 100644[m
[1m--- a/src/Main.java[m
[1m+++ b/src/Main.java[m
[36m@@ -1,5 +1,47 @@[m
[32m+[m[32mimport java.util.Arrays;[m
[32m+[m[32mimport java.util.Scanner;[m
[32m+[m
 public class Main {[m
[32m+[m
     public static void main(String[] args) {[m
[32m+[m[32m        Scanner scanner = new Scanner(System.in);[m
[32m+[m
[32m+[m[32m        System.out.print("Enter array size: ");[m
[32m+[m[32m        int size = scanner.nextInt();[m
[32m+[m
[32m+[m[32m        int[] array = new int[size];[m
[32m+[m
[32m+[m[32m        System.out.println();[m
[32m+[m[32m        for (int i = 0; i < size; i++) {[m
[32m+[m[32m            System.out.print("Enter element " + (i + 1) + ": ");[m
[32m+[m[32m            array[i] = scanner.nextInt();[m
[32m+[m[32m        }[m
 [m
[32m+[m[32m        System.out.print("\nEnter target value: ");[m
[32m+[m[32m        int target = scanner.nextInt();[m
[32m+[m
[32m+[m[32m        // Linear Search[m
[32m+[m[32m        int linearResult = Algorithms.linearSearch(array, target);[m
[32m+[m[32m        System.out.println("\nLinear Search Result:");[m
[32m+[m[32m        if (linearResult != -1) {[m
[32m+[m[32m            System.out.println("Target found at index " + linearResult);[m
[32m+[m[32m        } else {[m
[32m+[m[32m            System.out.println("Target not found");[m
[32m+[m[32m        }[m
[32m+[m
[32m+[m[32m        // Sort array before Binary Search[m
[32m+[m[32m        int[] sortedArray = Arrays.copyOf(array, array.length);[m
[32m+[m[32m        Arrays.sort(sortedArray);[m
[32m+[m
[32m+[m[32m        int binaryResult = Algorithms.binarySearch(sortedArray, target);[m
[32m+[m[32m        System.out.println("\nBinary Search Result:");[m
[32m+[m[32m        if (binaryResult != -1) {[m
[32m+[m[32m            System.out.println("Target found at index " + binaryResult);[m
[32m+[m[32m        } else {[m
[32m+[m[32m            System.out.println("Target not found");[m
[32m+[m[32m        }[m
[32m+[m
[32m+[m[32m        scanner.close();[m
     }[m
[32m+[m
 }[m
\ No newline at end of file[m
