public class Algorithms {
  public static int linearsearch(int A[], int k) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k)
                return i;
        }
        return -1;
    }

    public static int binarysearch(int A[], int k) {
        int low = 0;
        int high= A.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (A[mid]==k)
                return mid;
            if (A[mid]< k) {
                low = mid +1 ;}
            else high = mid -1;
        }
        return -1;

    }
}

