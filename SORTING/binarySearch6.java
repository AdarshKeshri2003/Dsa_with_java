/*
 * A peak element is an element that is strictly greater than its neighbour
 * given a O based integer array num, find a peak element and return its index 
 * If the array contain multiple peak return the index to any of the peaks.
 * You may imagine that num[-1] = num[n] = - infinity , In other words, an 
 * elelmet is always considered to be strictly greater than a neighbour 
 * that is outside the array 
 * Input = {1,2,3,1}
 * output: 2
 */
public class binarySearch6{
    static int findPeak(int[] a){
        int n = a.length;
        int st = 0;
        int end = n-1;
        while(st<= end){
            int mid = st + (end - st)/2;
            if((mid ==0 || a[mid-1]< a[mid]) && (mid == n-1 || a[mid]> a[mid + 1])){
                return mid;
            }
            if(a[mid] < a[mid + 1]){
                st = mid + 1;
            }
            else{
                end = mid -1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {2,4,3,4,8,6,7};
        System.out.println(findPeak(a));
    }
}
