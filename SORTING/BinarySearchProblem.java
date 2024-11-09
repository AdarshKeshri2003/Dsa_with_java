public class BinarySearchProblem{
    //Q1 :Find the occurence of a given element x, given that the given array is sorted.If no occurrence of x is found then return -1;
    static int problem1(int[] array, int target){
        int start = 0;
        int n = array.length;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                return mid ;
            }
            else if (target < array[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    //Q 2 : Find the square root of the given non negative value x. Round it off to the nearest floor integer value
    static int problem2(int x){
        int start =0;
        int end = x;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int val = mid* mid;
            if(val == x ){
                return mid ;
            }
            else if(val< x ){
                ans = mid;
                start = mid + 1;
            }
            else{
               
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] array = {2,5,5,5,6,6,8,9,9,9};
        int target =5;
        System.out.println(problem1(array,target));
        System.out.println(problem2(24));
    }
}