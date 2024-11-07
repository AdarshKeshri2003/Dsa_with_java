public class RadixSort{
    static void display(int[] array){
        for(int val : array){
            System.out.print(val + " ");
        }
    }
    static int findMax(int[] array){
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<array.length;i++){
            if(array[i]>mx){
                mx = array[i];
            }
        }
        return mx;
    }


    static void countSort(int[] array,int place){
        int n = array.length;
        int[] output = new int[n];
        
        int[] count = new int[10];
        for(int i =0; i< array.length; i++){
            count[(array[i]/place)%10]++;//make frequency array  
        }
        // MAke prefix sum array of count array
        for(int i =1;i<count.length;i++){ //TC-> max
            count[i] += count[i-1];
    
        }
        // find the index of each element in the original array and put it in output array
        for(int i = n-1; i>=0;i--){//TC -> n
            int idx = count[(array[i]/place)%10] -1;
            output[idx] = array[i];
            count[(array[i]/place)%10]--;
        }
        // copy of all element of output to given array
        for(int i = 0;i <n ; i++){
            array[i] = output[i];
        } 
    }

    static void radixSort(int[]array){
        int max = findMax(array);//get maximum element
        //applying count sort to sort elements based in place value
        for(int place = 1;max/place>0; place*=10){//Tc -> d 
            countSort(array, place);
        }
    }

    public static void main(String[] args) {
        int[] array = {652,245,845,742,962,156,354};
        System.out.println("ARRAY before sorting");
        display(array);
        System.out.println();
        System.out.println("Array after sorting");
        radixSort(array);
        display(array);
    }
}