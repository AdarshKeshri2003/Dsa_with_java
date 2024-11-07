import java.util.Scanner;

/**
 * question4
 */
public class question4 {

    static boolean ifSorted(int[] array){
        boolean check = true;
        for(int i = 0; i < array.length -1;i++){
            if(array[i] <= array[i+1]){
                //System.out.println("True");
                check = true;
            }else{
                //System.out.println("false");
                check = false;    
            }
        }return check;
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

        System.out.println(ifSorted(array));
    }
}