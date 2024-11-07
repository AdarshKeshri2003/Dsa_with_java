//given Q queries chck if the given number is present int he rray or not.
import java.util.Scanner;

public class query {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    static int[] makefrequencyarray(int[] array){
        int[] freq = new int[100005];
        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }return freq;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the array value");
        printArray(array);
        int[] freq = makefrequencyarray(array);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();
        
        while(q>0){
            System.out.println("Enter number to be searched");
            int x= sc.nextInt();
            if(freq[x] >0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
}