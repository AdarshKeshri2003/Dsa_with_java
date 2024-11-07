import java.util.Scanner;
public class array10{
    static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }System.out.println();
    }

    static int[] rotate(int[] array,int k ){
        int n = array.length;
        k = k%n;//agar k 52 h aur n 5  h to 52 baar loop  na chal ke only 2(52%5) baar ji chale
        int[] ans = new int[n];// answer jo aayega uske liye naya array banye 
        int j = 0;
        for(int i = n- k; i<n;i++){
        ans[j++] = array[i];
        }
        for(int i = 0; i <(n-k);i++){
            ans[j++] = array[i];
        }return ans;
    }
    public static void main(String[] args){
    System.out.println("HAR HAR MAHADEV");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the length of the array");
    for(int i = 0; i < n; i++){
        array[i] = sc.nextInt();
    }
    System.out.println("The array is:");
    printArray(array);
    System.out.println("Enter k");
    int k = sc.nextInt();
    System.out.println("rotated array");
    int[] ans = rotate(array,k);
    printArray(ans);
    //System.out.println(rotate(array, k));
    }
}