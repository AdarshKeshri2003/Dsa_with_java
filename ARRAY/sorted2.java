import java.util.Scanner;
public class sorted2{
    static void printArray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }System.out.println();
    }
    //Givenn an array of integer 'a', movr all the even integer at the beginning of the array
//folllowed by all the odd integers. THe reltaive order of odd or even integer does not matter. 
//Return any array that satisfies the given condition
static void oddEven(int[] array){
    for(int i =0; i<array.length; i++){
    if(array[i]%2 ==0){
        System.out.print(array[i]+" ");
    }
}
    for(int i =0; i<array.length; i++){
        if(array[i]%2 !=0){
            System.out.print(array[i]+" ");
        }
    }
    System.out.println();
}
//Given na integer array 'a' sorted in non-decreasing order , retuen an array of the square of each 
//number sorted in  non decreasing order
// this method is for positive integer
static void squareSortM1(int[] array){
    for(int i = 0; i<array.length;i++){
        array[i] = array[i]*array[i];
        System.out.print(array[i] + " ");
    }
}
    // this method is for all the interger either pisitive or negative
    static int[] squaresortM2(int[] array){
        int n = array.length;
        int[] ans= new int[n];
        int left =0;
        int right =n-1;
        int k = n-1;
        while(left<= right){
            if(Math.abs(array[left])> Math.abs(array[right])){
                ans[k--] = array[left]*array[left];// ans[k++] = array[left]*array[left]; or ans[k]= array[left]*array[left]; k++;
                left++;
            }
            else{
                ans[k--] = array[right]*array[right];
                right--;
            }
        }
        return ans;
    }


public static void main(String[] args){
    System.out.println("Har Har Mahadev");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the element of the array ");
    for(int i=0; i<n; i++){
        array[i]= sc.nextInt();

    }
    printArray(array);
//System.out.println("odd & even");
 //       oddEven(array);

     //   System.out.println("non decreaing order square");
    //     squareSortM1(array);
    System.out.println("the sortedb squre non decreasing no : ");
    int[] sort = squaresortM2(array);

    printArray(sort);
    }
}