import java.util.Scanner;

/**
 * pyramidpattern
 */
public class pyramidpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++)// transposing the rows
        {
            for (int j = 1; j <= r - i; j++)// print r-1 spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)// priny 2*i-1 stars
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}