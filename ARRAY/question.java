import java.util.Scanner;

/**
 * question
 */
// COUNT OF NUMBER O OCCUERENCE OF A PARTICULAR ELEMENT X
public class question {

    static int countOccurence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers " + n + " element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the x");
        int x = sc.nextInt();
        System.out.println("Count of X " + countOccurence(arr, x));
    }
}
