/**
 * recursion6
 */
import java.util.Scanner;
 public class recursion6 {

    // print all the element of the array using recursion 
    static void printArray(int[] array, int index){
        // base case 
        if (index == array.length){
            return;
        }
        //subproblem + selfwork
        System.out.println(array[index]);
        printArray(array, index +1);
    }



        // find the max value of the array
        static int maxArray(int[] array, int index){
            //base case
            if(index == array.length  -1){
                return array[index];
            }
            //subproblem
            maxArray(array, index +1);
            //selfwork
            return Math.max(maxArray(array, index +1), array[index]);
        }
    



        // find the sum of the element of the array
        static int sumArray(int[] array, int index){
            //Base case
            if(index == array.length -1){
                return array[index];
        }
        //subproblem selfwork
        return sumArray(array, index + 1) + array[index];
    } 




    
            //find the particular element is present in the array or not , if present return true otherwise false
    static boolean search(int[] array,int n, int target, int index){
        // base case
        if(index >= n){
            return false;
        }
        //self work
        if(array[index] == target){
            return true;
        }
        //subproblem
        return search(array,n,target,index +1 );
    }



        // find the first index of the occurrence of the target element in the array
        static int findIndex(int[] array,int n, int target, int index){
        // base case
        if(index >= n){
            return -1;
        }
        //self work
        if(array[index] == target){
            return index;
        }
        //subproblem
        return findIndex(array,n,target,index +1 );
    }
    


    //Print the all index where the integer X is present int the array
    static void printIndex(int[] array, int n , int target, int index){
        //BAse case
        if(index>= n){
            return;
        }
        //self work
        if(array[index]==target){
            System.out.println(index +" ");
        }
        printIndex(array,n,target,index + 1);
    }
        public static void main(String[] args) {
        int[] array = {5,29,30,46,57,65,75,53,2,11,23};
        printArray(array, 0);
        System.out.println("Max element of the array" + maxArray(array, 0));
        System.out.println("Sum of element of the array" + sumArray(array, 0));
        int target = 11;
        int n =array.length;
        if(search(array,n,target,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
 
        System.out.println("The index at which the target element is present");
        System.out.println(findIndex(array,n, target,0));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target2 = sc.nextInt();
        
        int[] array2 = {1,6,8,45,1,54,1,56,9,1};
        int n2 = array2.length;
        System.out.println("the indices are: ");
        printIndex(array2,n2,target2,0);
        
    }
}