public class Algorithms {
class SearchArray {
    private int[] elements;
    private int size;

    public SearchArray(int size, Scanner scanner) {
        this.size = size;
        this.elements = new int[size];
        System.out.println("\nEnter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            elements[i] = scanner.nextInt();
        }
    }

    public int[] getElements()       { return Arrays.copyOf(elements, size); }
    public int[] getSortedElements() {
        int[] sorted = Arrays.copyOf(elements, size);
        Arrays.sort(sorted);
        return sorted;
    }
    public int getSize()             { return size; }

    public void display() {
        System.out.print("  Array: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println(" ]");

        System.out.print("  Index: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(i);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println(" ]");
    }
}
class LinearSearch {
    private SearchArray searchArray;

    public LinearSearch(SearchArray searchArray) {
        this.searchArray = searchArray;
    }

    public SearchResult search(int target) {
        int[] arr = searchArray.getElements();
        int comparisons = 0;

        System.out.println("\n  Steps:");
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            System.out.println("    [" + i + "] = " + arr[i] +
                (arr[i] == target ? " → match found!" : " → no match"));
            if (arr[i] == target) {
                return new SearchResult(true, i, comparisons);
            }
        }
        return new SearchResult(false, -1, comparisons);
    }
}
  
class BinarySearch {
    private SearchArray searchArray;
    private int[] sortedArray;

    public BinarySearch(SearchArray searchArray) {
        this.searchArray = searchArray;
    }

    public SearchResult search(int target) {
        sortedArray = searchArray.getSortedElements();
        int lo = 0, hi = sortedArray.length - 1;
        int comparisons = 0, step = 0;

        System.out.println("\n  Sorted array used:");
        System.out.print("  [ ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            if (i < sortedArray.length - 1) System.out.print(", ");
        }
        System.out.println(" ]");

        System.out.println("\n  Steps:");
        while (lo <= hi) {
            step++;
            int mid = (lo + hi) / 2;
            comparisons++;
            System.out.print("    Step " + step + ": lo=" + lo +
                " hi=" + hi + " mid=[" + mid + "]=" + sortedArray[mid]);

            if (sortedArray[mid] == target) {
                System.out.println(" → match found!");
                return new SearchResult(true, mid, comparisons);
            } else if (sortedArray[mid] < target) {
                System.out.println(" < " + target + " → search right half");
                lo = mid + 1;
            } else {
                System.out.println(" > " + target + " → search left half");
                hi = mid - 1;
            }
        }
        return new SearchResult(false, -1, comparisons);
    }

    public int[] getSortedArray() { return sortedArray; }
}
class SearchProgram {
    private Scanner scanner;
    private SearchArray searchArray;

    public SearchProgram() {
        this.scanner = new Scanner(System.in);
    }

    private void printDivider(String title) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.printf( "║  %-36s║%n", title);
        System.out.println("╚══════════════════════════════════════╝");
    }

    private void printResult(String label, SearchResult result, int target) {
        System.out.println("\n  ┌─ Result ─────────────────────────────");
        System.out.println("  │  Algorithm    : " + label);
        System.out.println("  │  Target       : " + target);
        System.out.println("  │  Status       : " + (result.isFound() ? "FOUND" : "NOT FOUND"));
        if (result.isFound()) {
            System.out.println("  │  Index        : [" + result.getIndex() + "]");
        }
        System.out.println("  │  Comparisons  : " + result.getComparisons());
        System.out.println("  └──────────────────────────────────────");
    }

    public void run() {
        printDivider("Search Program — OOP Java");

        System.out.print("\nEnter the size of the array: ");
        int size = scanner.nextInt();

        searchArray = new SearchArray(size, scanner);

        System.out.println("\nYour array:");
        searchArray.display();

        System.out.print("\nEnter the target value to search for: ");
        int target = scanner.nextInt();

      
    printDivider("1. Linear Search");
        LinearSearch linear = new LinearSearch(searchArray);
        SearchResult linearResult = linear.search(target);
        printResult("LinearSearch", linearResult, target);
      
        printDivider("2. Binary Search");
        BinarySearch binary = new BinarySearch(searchArray);
        SearchResult binaryResult = binary.search(target);
        printResult("BinarySearch", binaryResult, target);

        printDivider("Summary");
        System.out.printf("  %-20s %-12s %-10s%n", "Algorithm", "Status", "Comparisons");
        System.out.println("  ──────────────────────────────────────");
        System.out.printf("  %-20s %-12s %-10s%n",
            "LinearSearch",
            linearResult.isFound() ? "FOUND [" + linearResult.getIndex() + "]" : "NOT FOUND",
            linearResult.getComparisons());
        System.out.printf("  %-20s %-12s %-10s%n",
            "BinarySearch",
            binaryResult.isFound() ? "FOUND [" + binaryResult.getIndex() + "]" : "NOT FOUND",
            binaryResult.getComparisons());

        scanner.close();
    }
}

