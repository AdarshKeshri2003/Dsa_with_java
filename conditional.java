import java.util.Scanner;

/**
 * conditional
 */
public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // if else statement
        if (a % 2 == 0) {
            System.out.println("EVEN");

        } else {
            System.out.println("Odd");
        }

    }
}