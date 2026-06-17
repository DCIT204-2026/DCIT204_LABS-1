import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number elements ");
        int num = scanner.nextInt();
        int [] A = new int [num];
        System.out.println("Input numbers of your choice");
       for (int i =0; i< num; i++){
           A[i]= scanner.nextInt();
       }

        System.out.println("Enter target elemnet");
        int k =  scanner.nextInt();

        int pos = Algorithm.linearsearch(A,k);
        if (pos != -1) {
            System.out.println("LINEAR SEARCH COMPLETE");
            System.out.println("Target elemtent position:" + pos);
        }
        else {
            System.out.println("LINEAR SEARCH COMPLETE");
            System.out.println("Target Not found");
        }
        System.out.println(" ");
        Arrays.sort(A);
        int posb = Algorithm.binarysearch(A,k);
        if (posb != -1) {
            System.out.println("BINARY SEARCH COMPLETE");
            System.out.println("Target elemtent position:" + posb);
        }
        else {
            System.out.println("BINARY SEARCH COMPLETE");
            System.out.println("Target Not found");
        }


        scanner.close();
    }
}

