import java.util.Scanner;

public class array3 {
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
        System.out.println("THe copied array is");
        int[] array2 = array;
        printArray(array2);
        // changing some values of the arrray2
        array2[0] = 11;
        array2[2] = 55;
        System.out.println("Original array after changing array2");
        printArray(array);
        System.out.println("Copied array after changing the  value of array2");
        printArray(array2);

    }
}