/**
 * clonning
 */
public class clonning {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i] = 0;
        } 
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 15;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("original value");
        printArray(arr);

        int[] arr_2 = arr.clone();
        System.out.println("Copied Array value");
        printArray(arr_2);

        // changing the arr_2
        System.out.println("Original value after changing arr_2");
        changeArray(arr_2);
        printArray(arr);

        System.out.println("Copied arr after changing arr_2");
       // changeArray(arr_2);
        printArray(arr_2);

    }
}