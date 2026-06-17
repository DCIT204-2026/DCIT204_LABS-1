public class Algorithm {
    public static int linearSearch(int[] numPool, int targetValue) {
        int currentIndex = 0;
        for (int element : numPool) {
            if (element == targetValue) {
                return currentIndex;
            }
            currentIndex++;
        }
        return -1;
    }
    public static int binarySearch(int[] numPool, int targetValue) {
        int lowMarker = 0;
        int highMarker = numPool.length - 1;
        while (lowMarker <= highMarker) {
            int middleMarker = (lowMarker + highMarker) / 2;
            if (numPool[middleMarker] == targetValue) {
                return middleMarker;
            } else if (numPool[middleMarker] < targetValue) {
                lowMarker = middleMarker + 1;
            } else {
                highMarker = middleMarker - 1;
            }
        }
        return -1;
    }
    
}