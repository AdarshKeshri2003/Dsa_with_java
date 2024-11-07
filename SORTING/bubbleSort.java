
public class bubbleSort {
    static void bubbleSortInc(int[] a){
        int n = a.length;
        //n-1 iterations/passes
        // i from 0 to n-2 -> n-1 iterations/passes 
        for(int i =0; i< n-1; i++){
            boolean flag = false;// has any swapping happened
            for(int j =0; j< n-i-1; j++){
                /*
                 * last i elements are always at correct sorting positions'
                 * so no need to check them
                 */
                if(a[j]>a[j+1]){
                    //swap - a[j],a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;//some swap happened
                }
            }
            if(flag == false){// have any swap happened or not 
                // flag == false or we can write !flag 
                return;
            }
        }
    }
//Deceasing Order
    static void bubbleSortDec(int[] a){
        int n = a.length;
        //n-1 iterations/passes
        // i from 0 to n-2 -> n-1 iterations/passes 
        for(int i =0; i< n-1; i++){
            boolean flag = false;// has any swapping happened
            for(int j =0; j< n-i-1; j++){
                /*
                 * last i elements are always at correct sorting positions'
                 * so no need to check them
                 */
                if(a[j]<a[j+1]){
                    //swap - a[j],a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;//some swap happened
                }
            }
            if(flag == false){// have any swap happened or not 
                // flag == false or we can write !flag 
                return;
            }
        }
    }
    public static void main(String[] args){
        int[] a= {7,6,5,4,3};
        System.out.println("Increasing order");
        bubbleSortInc(a);
        for(int i : a){// It is for each loop
            /*
             * for for loop
             * for(int i =0; i< a.length;i++)
             */
            System.out.print(i +" ");
            
        }
        System.out.println();
        System.out.println("Decreasing order");
        bubbleSortDec(a);
        for(int i : a){// It is for each loop
            /*
             * for for loop
             * for(int i =0; i< a.length;i++)
             */
            System.out.print(i +" ");
        }
    }
}