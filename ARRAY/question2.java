import java.util.Scanner;

/**
 * question2
 */
// FIND THE LAST OCCUERENCE OF AN ELEMENT X IN A GIVEN ARRAY.
public class question2 {
    static int occurenceElement(int[] arr, int x) {
        int element = -1;// -1 isliye liye kyuki agar jo x me dal rhe h vo array me nhi hoga to -1 dega
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                element = i;// i isliye kyuki kon sa occurrence p aayga
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the x ");
        int x = sc.nextInt();
        System.out.println("The last occurence of x is " + occurenceElement(arr, x));
    }

}
