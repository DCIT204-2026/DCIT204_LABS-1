public class Main {
    public static void main(String[] args) {

    }
}
Collect array size from the user
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println(); 
        int[] array = new int[size];

       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(); 

        
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        
        int linearResult = Algorithm.linearSearch(array, target);
        System.out.println("Linear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }
        System.out.println();

        
        Arrays.sort(array);

    
        int binaryResult = Algorithm.binarySearch(array, target);
        System.out.println("Binary Search Result:");
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
}
