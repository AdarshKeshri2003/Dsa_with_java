/**
 * changing
 */
public class changing {
    static void changeVal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 12;
        System.out.println("Original Value");
        printArray(arr);

        System.out.println("Changed value");
        changeVal(arr);
        printArray(arr);
    }
}