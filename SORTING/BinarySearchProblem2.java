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
     * target,return if it is in the array.Otherwise return -1.
     * input :
     * A=[3,4,5,1,2] target = 1
     * output = 3
     */
    static int Q2(int[] array,int target){
        int start =0;
        int n = array.length;
        int end = n-1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(target == array[mid]){
                return mid;
            }
            else if(array[end]>array[mid]){
                if(target < array[end] && target >array[mid]){
                    start = mid +1;
                }
                else{
                    end  = mid -1;
                }
            }
            else{
                if(target < array[mid] && target > array[start]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
    }
    return -1;
}
/*
 * Q3 Search elements in rotated sorted array with duplicate elements.
 * Return true if the elements is found, else return false.
 * input : [0,0,0,0,1,1,1,2,2,,0,0,0] target =2
 * output : true
 */
static boolean Q3(int[] a,int target){
    int start = 0;
    int end = a.length -1;
    while(start <= end){
        int mid = start + (end - start)/2;
        if(target == a[mid]){
            return true;
        }
        else if(a[mid] < a[end]){
            if(target > a[mid] && target < a[end]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        else if(a[start] == a[mid] && a[end] == a[mid]){
            start++;
            end--;
        }
        else{
            if(target < a[mid] && target >a[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
    }
    return false;
}

    public static void main(String[] args) {
        int[] a = {3,4,5,6,7,8,9,1,2};
        System.out.println(Q1(a));
        System.out.println(Q2(a,7));
        int[] b = {0,0,0,1,1,1,2,0,0,0};
        System.out.println(Q3(b,2));

    }
}