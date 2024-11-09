public class BinarySearch{
    static boolean search(int[] array,int target){
        int start = 0;
        int n = array.length;
        int end = n-1;
        
        while(start<= end){
            int mid = (start + end)/2;
            if(target ==array[mid]){
                return true;
            }
            else if(target < array[mid]){
                end =mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }

    /*
     * Method 2 
     * by recursion method
     */
    static boolean recsearch(int[] array, int start, int end, int target){
        if(start > end){//base case
            return false;
        }
        int mid = (start+ end)/2;//self work
        if(target == array[mid]){
            return true;
        }
        else if(target < array[mid]){//recursive work
            return recsearch(array, 0, mid -1 ,target);
        }
        else{
            return recsearch(array,mid +1, end, target);//recursive work
        }
    }
    public static void main(String[] args){
        int[] array = {1,3,4,6,9,12,15,16,18,21,100,1000,2000};
        int target = 21;
        System.out.println(search(array,target));
        System.out.println(recsearch(array,0,array.length -1, target));

    }
}