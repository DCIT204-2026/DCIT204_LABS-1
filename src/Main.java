import java.util.Scanner;

class InputFilter {
    Scanner input = new Scanner(System.in);

    public void resultOutput(int result) {
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public void resultOutputBinary(int binaryResult) {
        if (binaryResult != -1) {
            System.out.println("Element found at index (Binary Search): " + binaryResult);
        } else {
            System.out.println("Element not found (Binary Search).");
        }
    }

    public void filterInputInt(boolean isBinary) {
        int target = -1;
        System.out.println("Enter a number to search for: ");
        if (input.hasNextInt()) {
            target = input.nextInt();
        }

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        if (isBinary == false) {
            int result = Algorithm.linearSearch(arr, target);
            resultOutput(result);
        } else {
            java.util.Arrays.sort(arr);
            int binaryResult = Algorithm.binarySearch(arr, target);
            resultOutputBinary(binaryResult);
        }
    }

    public void filterInputString(boolean isBinary) {
        String target = "";
        System.out.println("Enter a string to search for: ");
        if (input.hasNextLine()) {
            target = input.nextLine();
        }

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        input.nextLine(); // Eat the leftover Enter key before the loop!

        String[] arr = new String[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextLine();
        }

        if (isBinary == false) {
            int result = Algorithm.linearSearch(arr, target);
            resultOutput(result);
        } else {
            java.util.Arrays.sort(arr);
            int binaryResult = Algorithm.binarySearch(arr, target);
            resultOutputBinary(binaryResult);
        }
    }

    public void filterInputFloat(boolean isBinary) {
        float target = -1;
        System.out.println("Enter a number to search for: ");
        if (input.hasNextFloat()) {
            target = input.nextFloat();
        }

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        float[] arr = new float[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextFloat();
        }

        if (isBinary == false) {
            int result = Algorithm.linearSearch(arr, target);
            resultOutput(result);
        } else {
            java.util.Arrays.sort(arr);
            int binaryResult = Algorithm.binarySearch(arr, target);
            resultOutputBinary(binaryResult);
        }
    }

    public void filterInputchar(boolean isBinary) {
        char target = ' ';
        System.out.println("Enter a character to search for: ");
        if (input.hasNext()) {
            target = input.next().charAt(0);
        }

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.next().charAt(0);
        }

        if (isBinary == false) {
            int result = Algorithm.linearSearch(arr, target);
            resultOutput(result);
        } else {
            java.util.Arrays.sort(arr);
            int binaryResult = Algorithm.binarySearch(arr, target);
            resultOutputBinary(binaryResult);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linear Search Program!");
        System.out.println("Please choose an option:");
        System.out.println("1. Perform a linear search");
        System.out.println("2. Perform a binary search");
        System.out.println("3. Exit");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        boolean isBinary = false;
        
        switch (choice) {
            case 1:
               System.out.println("Select the type of input you want to provide: \n1. Integer\n2. String\n3. Character\n4. Float");
                String inputType = scanner.nextLine();
                InputFilter inputFilter = new InputFilter();
                if (inputType.equals("1")||inputType.equals("Integer")) {
                    inputFilter.filterInputInt(isBinary);
                } else if (inputType.equals("2")||inputType.equals("String")) {
                    inputFilter.filterInputString(isBinary);
                } else if (inputType.equals("3")||inputType.equals("Character")) {
                    inputFilter.filterInputchar(isBinary    );
                } else if (inputType.equals("4")||inputType.equals("Float")) {
                    inputFilter.filterInputFloat(isBinary   );
                } else {
                    System.out.println("Invalid input type selected.");
                }
                break;
            case 2:
                isBinary = true;
                System.out.println("Select the type of input you want to provide: \n1. Integer\n2. String\n3. Character\n4. Float");
                String inputTypeBinary = scanner.nextLine();
                InputFilter inputFilterBinary = new InputFilter();
                if (inputTypeBinary.equals("1")||inputTypeBinary.equals("Integer")) {
                    inputFilterBinary.filterInputInt(isBinary);
                } else if (inputTypeBinary.equals("2")||inputTypeBinary.equals("String")) {
                    inputFilterBinary.filterInputString(isBinary    );
                } else if (inputTypeBinary.equals("3")||inputTypeBinary.equals("Character")) {
                    inputFilterBinary.filterInputchar(isBinary      );
                } else if (inputTypeBinary.equals("4")||inputTypeBinary.equals("Float")) {
                    inputFilterBinary.filterInputFloat(isBinary   );
                } else {
                    System.out.println("Invalid input type selected.");
                }
                break;
            case 3:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Inva2lid choice. Please try again.");
        }
        
        scanner.close();
    }

    
}
