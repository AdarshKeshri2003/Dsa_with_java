/*
 *Seach the target value in a 2D integer matrix of dimension n x m and
 return true if found, else return false. This matrix has the following 
 properties:
 1. Integers in each roe are sorted from left to right .
 2. The first integer of each roe is greater than the last integer of the 
 previous roe.
 Input :
 MAtrix = [[1,,5,7],[10,11,16,20],[23,30,34,38]];
 target = 3
 output:
 true
 */

public class BinarSearch{
    static boolean search(int[][] a, int target){
        //number of row = n , number of column = m
        int n = a.length;
        int m = a[0].length;
        int st =0;
        int end = n*m -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int midEt = a[mid/m][mid%m];
            if(target == midEt) return true;
            
            else if(target < midEt){
                end = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] a = {{1,3,5,7},{10,11,13,15},{21,28,34,50}};
        
        System.out.println(search(a,3));
        System.out.println(search(a,101));
        
    }
}