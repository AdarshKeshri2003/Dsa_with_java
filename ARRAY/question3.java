import java.util.Scanner;

/**
 * question3
 */
// COUNT THE NUMBER OF ELEMENT STRICTLY GREATER THAN VALUE X
public class question3 {

    static int strictlyGreater(int[] array, int x) {
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                element++;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the value of " + n + "element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Enter the value for x ");
        int x = sc.nextInt();
        System.out.println("The value greater than x in the array is " + strictlyGreater(array, x));
    }
}