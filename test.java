import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit = 0;
        // while (n > 0) {
        // n /= 10;
        // numofdigit++;
        // }
        // System.out.println("The number of digit is " + numofdigit);

        for (int sumofdigit = 0; n > 0; sumofdigit++) {
            sumofdigit += n % 10;
            n /= 10;
        }
        System.out.println(sumofdigit);
    }
}
