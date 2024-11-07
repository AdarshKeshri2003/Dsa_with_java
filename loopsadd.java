import java.util.Scanner;

public class loopsadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while (num <= n) {
            sum = sum + num;
            System.out.println(num);
            num++;
        }
        System.out.println(sum);
    }

}