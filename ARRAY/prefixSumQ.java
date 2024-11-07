import java.util.Scanner;
public class prefixSumQ{
    static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }System.out.println();
    }


    //in the same array 
    static int[] makePrefixSumM2(int[] array){
        int n = array.length;
        for(int i = 1; i< n; i++){
            array[i] = array[i-1] + array[i];
        }
        return array;
    }
    //Q1 : Given an array of integer of size n . Answer q queries where you need 
    // to print the sum of values in an given  range of indices from 1 to r?


    //Q2 check if we can partition the array into twosubarray with equal sum. 
    static boolean middle(int[] array){
        int n = array.length;
        int m = n /2 -1;

        if(array[m] == array[n-1]- array[m]){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enetr the element of the array");
    for(int i = 0; i <n; i++){
        array[i] = sc.nextInt();
    }
    System.out.println("The element of the array are");
    printArray(array);
    
    
    System.out.println("By method 2");
    int prefix2[] = makePrefixSumM2(array);
    printArray(prefix2);
    System.out.println("Enter the queries");
    int q = sc.nextInt();
    for(int i = 1; i<= q; i++){
        System.out.println("Enter the range");
        int l =sc.nextInt();
        int r = sc.nextInt();
        int ans = array[r] - array[l];
        System.out.println("Sum" + ans);

    }

    System.out.println(middle(array));

    }
}