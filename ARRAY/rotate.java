//Rotate the given array a by k steps, where k is non negative without using extra space..
//
import java.util.Scanner;

public class rotate {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    static void rotate(int array[], int k ){
        int n= array.length;
        for (int i = n-k; i < n; i++) {
            System.out.print(array[i] +" ");
        }
        for(int i = 0;i <= n-k-1;i++){
            System.out.print(array[i] +" "); 
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the array value");
        printArray(array);
        System.out.println("ENter k ");
        int k = sc.nextInt();
        System.out.println("Rotate");
        rotate(array, k);
    }
}