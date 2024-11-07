import java.util.Scanner;

/**
 * 
 * array9
 */
// Q : the reversing the array
public class array9 {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        printArray(array);

        System.out.println("Reverse array");
        for (int i = 0; i < n; i++) {
            System.out.println(array[(n - 1) - i]);
        }
    }
}