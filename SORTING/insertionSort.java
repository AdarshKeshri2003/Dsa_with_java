public class insertionSort{

    //Increasing Order
    static void insertionSortInc(int[] a){
        int n = a.length;
        for(int i =1; i<n; i++){
            int j =i;
            while(j>0 && a[j]<a[j-1]){
                //swap a[j] and a[j-1]
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1 ] = temp;
                j--;
            }
        }
    }

    //Decreasing Order
    static void insertionSortDec(int[] a){
        int n = a.length;
        for(int i =1; i<n; i++){
            int j =i;
            while(j>0 && a[j]>a[j-1]){
                //swap a[j] and a[j-1]
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1 ] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {5,8,1,9,3,4};
        insertionSortInc(array);
        System.out.println("INCREASING ORDER");
        for(int val: array){
            System.out.print(val +" ");
        }
        System.out.println();
        insertionSortDec(array);
        System.out.println("DECREASING ORDER");
        for(int val: array){
            System.out.print(val +" ");
        }
    }
}