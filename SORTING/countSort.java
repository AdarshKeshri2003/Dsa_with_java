public class countSort{
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

static void basicCountSort(int[] array){
    int max = findMax(array);// find the largest element of the array
    int[] count = new int[max +1];
    for(int i =0; i<array.length; i++){
        count[array[i]]++;
    }
    int k =0;
    for(int i =0; i<count.length; i++){
        for(int j =0; j<count[i]; j++){
            array[k++] = i;
        }
    }

}
//method 2
static void countSortM2(int[] array){
    int n = array.length;
    int[] output = new int[n];
    int max = findMax(array);//find the largest element of the array
    int[] count = new int[max + 1];
    for(int i =0; i< array.length; i++){
        count[array[i]]++;//make frequency array -> TC -> n
    }
    // MAke prefix sum array of count array
    for(int i =1;i<count.length;i++){ //TC-> max
        count[i] += count[i-1];

    }
    // find the index of each element in the original array and put it in output array
    for(int i = n-1; i>=0;i--){//TC -> n
        int idx = count[array[i]] -1;
        output[idx] = array[i];
        count[array[i]]--;
    }
    // copy of all element of output to given array
    for(int i = 0;i <n ; i++){//TC -> n 
        array[i] = output[i];
    } 
}
    public static void main(String[] args) {
        int[] array = {4,2,6,4,2,1,4,5,1,3,4};
        System.out.println("Array before sorting");
        display(array);
        System.out.println();
        System.out.println("Array after sorting");
        basicCountSort(array);
        display(array);
    System.out.println();
        System.out.println("Array after sorting by using prefix sum");
        countSortM2(array);
        display(array);

    }
}