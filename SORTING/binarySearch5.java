/*
 * Given mountain array a of length greater than 3, return the index i
 * auch that a[o]< a[i]<...<a[i-1]<a[i]>a[i+1]>...>a[a.length -1].
 * This index is known as the peak index
 * Input:
 * Array ={0.,4,1,0}
 * output:
 * 1
 * MOUNTAIN  Problem example
 * 1,,4,5,6,8,5,3,1 where 8 is the peak index
 */
public class binarySearch5{
    static int search(int[]a){
        int st = 0;
        int end = a.length -1;
        int ans = -1;
        while(st<= end){
            int mid = st + (end - st)/2;
            if(a[mid] < a[mid+1]){
                ans = a[mid+1];
                st = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,6,8,7,4,2,1};
        System.out.println(search(a));
    }
}
