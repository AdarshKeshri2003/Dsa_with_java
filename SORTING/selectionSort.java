public class selectionSort{
//INCREASING ORDER
    static void selectionSortInc(int[] array){
        int n = array.length;
        for(int i = 0; i< n; i++){//i represent the current index
            //find the minimum element in unsorted part of array
            int min_index = i;
            for(int j = i +1; j<n;j++){
                if(array[j]<array[min_index]){
                    min_index = j;
                }
            }

            //swap current element and minimum element-> current inde i will have correct element
            //a[min_index],a[i]
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }
//DECREASING ORDER
    static void selectionSortDec(int[] array){
        int n = array.length;
        for(int i = 0; i< n; i++){//i represent the current index
            //find the minimum element in unsorted part of array
            int max_index = i;
            for(int j = i +1; j<n;j++){
                if(array[j]>array[max_index]){
                    max_index = j;
                }
            }

            //swap current element and minimum element-> current inde i will have correct element
            //a[min_index],a[i]
            int temp = array[i];
            array[i] = array[max_index];
            array[max_index] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = {7,2,6,3,1,9};
        selectionSortInc(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("Decreasing order");
        selectionSortDec(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}