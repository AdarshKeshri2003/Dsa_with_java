public class mergesort{
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    static void merge(int[] array, int l, int mid, int r){
        int n1 = mid - l + 1;
         int n2 = r - mid;
         int[] left = new int[n1];
         int[] right = new int[n2];
         
         for(int i =0; i< n1; i++){
            left[i] =array[l+i];
         }
         for(int j = 0; j < n2; j++){
            right[j] = array[mid+1+j];
         }
         int i =0;
         int j =0;
         int k =l;
         while(i < n1 && j < n2){
            if(left[i]<= right[j]){
                array[k++]= left[i++];
            }
            else{
                array[k++] = right[j++];
            }
         }

         while(i < n1){
            array[k++] = left[i++];
    }
    while(j<n2){
        array[k++] = right[j++];
    }
}
    static void mergeSort(int[] arr, int l, int r){
        if(l>= r)
        return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid );
        mergeSort(arr,mid+1, r);
        merge(arr, l, mid,r);
    }
    public static void main(String[] args){
        int[] array= {1,9,2,6,3,4,8,7};
        int n = array.length;
        System.out.println("Array Before  Sorting");
        displayArr(array);
        System.out.println( );
        mergeSort(array,0,n-1);
        System.out.println("Array After Sorting");
        displayArr(array);

    }
}