public class Algorithms {
    public static int linearSearch(int[] array, int target) {
    // 1. Loop through every element in the array starting from index 0
    for (int i = 0; i < array.length; i++) {
        
        // 2. Check if the current element matches the target value
        if (array[i] == target) {
            return i; // Target found! Return the current index immediately
        }
    }
    
    // 3. If the loop finishes and we find nothing, return -1
    return -1; 
}
}
