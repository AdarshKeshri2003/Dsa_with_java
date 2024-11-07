import java.util.Scanner;

public class array4 {
    // making a method that print the array
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        printArray(array);
        int[] array3 = array.clone();
        array3[0] = 0;
        array3[2] = 100;
        System.out.println("Original array after changing array3");
        printArray(array);
        System.out.println("Copied array after changing the  value of array3");
        printArray(array3);

    }
}
