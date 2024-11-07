import java.util.Scanner;

/**
 * loops
 */
public class loops {
    // print 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;// increment operators
        }
    }
}