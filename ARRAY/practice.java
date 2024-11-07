import java.util.Scanner;

/**
 * practice
 */
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] array =new int[n];
        System.out.println("Enter the the array");
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("THe result array");
        for(int i =0;i < array.length;i++){
            System.out.print(array[i] + " ");
    }
}
}