import java.util.Scanner;

/**
 * array8
 */
// Q1: GIven two integer a and b .Swap the given 2 two values using temporary
// variables?
// Q2: Given two integer a and b .Swap the given 2 two values using sum and
// difference method
public class array8 {
    static void swap(int a, int b) {
        System.out.println("the original value are:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("the swap value are:");
        // a = 3 ; b = 9
        int temp = a;// temp = 3
        a = b;// a = 9
        b = temp;// b = 3
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void swapSumDif(int a, int b) {
        System.out.println("the original value are:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("the swap value are:");
        // a = 3 ; b = 9
        a = a + b;// a = 9 + 3 = 12
        b = a - b;// b = 12 - 9 = 3
        a = a - b;// a = 12 - 3 = 9
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        Sysc = new Scanner(System.in);
        System.out.println("Enter the digits to be swapping ");
        int x = sc.nextInt();stem.out.println("HAR HAR MAHADEV");
        Scanner 
        int y = sc.nextInt();
        swap(x, y);
        System.out.println("The swapping of number using sum and difference method ");
        swapSumDif(x, y);
    }
}