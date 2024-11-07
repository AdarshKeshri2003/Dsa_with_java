import java.util.Scanner;
public class prefixSum{
    static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }System.out.println();
    }

//by making a new array 
    static int[] makePrefixSum(int[] array){
        int n = array.length;
        int[] prefix = new int[n];
        prefix[0] = array[0];
        for(int i = 1; i< n; i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        return prefix;
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
//Note ; the values of l and r in queries follow 1 based indexing
    static int Q1sol(int[] array ,int l, int r){
        int sum =0;
        for(int i = l; i<= r; i++){
            sum  += array[i] ;
        }
        return sum;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enetr the element of the array");
    for(int i = 0; i < n; i++){
        array[i] = sc.nextInt();
    }
    System.out.println("The element of the array are");
    printArray(array);
    System.out.println("By method 1");
    int prefix[] = makePrefixSum(array);
    printArray(prefix);
    System.out.println("By method 2");
    int prefix2[] = makePrefixSumM2(array);
    printArray(prefix2);
    
    }
}