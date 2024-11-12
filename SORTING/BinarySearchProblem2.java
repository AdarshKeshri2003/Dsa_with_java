public class BinarySearchProblem2{ 
    /*
     Q1: A rotated sorted array is a sorted array on which rotation has been performed
     * some number of times. Given a rotated sorted array, find the index of the
     * minimum element in the array. follow 0-based indexing and all the element 
     * are unique
     */
    static int Q1(int[] array){
        int start = 0;
        int n = array.length;
        int end = n-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(array[mid] <array[n-1]){
                ans = array[mid];
                end = mid -1;
            }
            else if(array[mid]> array[n-1]){
                start = mid +1;
            }
        }
        return ans;
    }

    /*
     * Q2 : Given the rotated sorted array of integers, which contains 
     * distinct elements, and an integer target, return the index of 
     * target,return if it is in the array.Otherwise retrn -1.
     * input :
     * A=[3,4,5,1,2] target = 1
     * output = 1
     */
    static int Q2(int[] array,int target){
        int start =0;
        int n = array.length;
        int end = n-1;
        int ans =-1;
        while(start <= end){
            int mid = start - (end -start)/2;
            if(array[mid] < target){
                start = mid + 1;
            }
            else if(array[mid]>target ){
                end = mid -1;
                ans = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3,4,5,6,7,8,9,1,2};
        System.out.println(Q1(a));
        System.out.println(Q2(a,4));

    }
}