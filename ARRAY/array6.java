/**
 * array6
 */
import java.util.Scanner;

public class array6 {
    static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }System.out.println();
    }
    static int targetTwoSum(int[] array, int sum){
        int count = 0;
        for(int i = 0; i< array.length;i++){
            for(int j = i +1; j < array.length; j++){
                if(array[i] + array[j] == sum){
                    count++;
                }
            }
        }return count;
    }

    static int tripleSum(int[] array, int sum_2){
        int count = 0;
        for(int i = 0; i< array.length;i++){
            for(int j = i +1; j < array.length; j++){
                for(int k = j+ 1; k < array.length; k++){
                    if(array[i] + array[j] +array[k] == sum_2){
                    count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("Har Har Mahadev");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array");
        for(int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("the array are " );
        printArray(array);
        System.out.println("Enter the number");
        int sum = sc.nextInt();
        System.out.println(targetTwoSum(array, sum));
        System.out.println("Enetr the number");
        int sum_2 = sc.nextInt();
        System.out.println(targetTwoSum(array, sum_2));

    }
}