import java.util.Scanner;

/**
 * primeno
 */
public class primeno {

    public static void main(String[] args) {
        System.out.println("primeno");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        if (n % n == 1 && n) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
}