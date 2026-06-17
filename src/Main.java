//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many elements do your want in you list: ");
    int a = scan.nextInt();
    int[] array = new int[a];

    for (int i = 0; i < array.length; i++) {
        System.out.println("enter the element:");
        array[i] = scan.nextInt();
    }


    int result = Algorithms.binarySearch(array, 10);


    if (result != -1) {
        System.out.println("target for binary search found at=" + result);

    } else {
        System.out.println("target not found");
    }

    int answer= Algorithms.linearSearch(array,10);

    if (result != -1){
        System.out.println("target for linear search found at: "+ answer);

    }else{
        System.out.println("target not found");
    }


}



