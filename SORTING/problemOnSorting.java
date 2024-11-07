
public class problemOnSorting {
    static void Q1(int[] a){
        int n = a.length;
        for(int i =0; i< n-1; i++){
            boolean flag = false;// has any swapping happened
            for(int j =0; j< n-i-1; j++){
                if(a[j] ==0 && a[j+1] !=0){
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
    static void Q2(String[] fruits){
        int n = fruits.length;
        for(int i =0; i<n-1; i++){
            int min_index = i;
            for(int j =i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[min_index]) < 0 ){
                    min_index = j;
                }
        }
        //swap fruits[min_index], fruits[i]
        String temp = fruits[i];
        fruits[i] = fruits[min_index];
        fruits[min_index] = temp;

    }
    }

    public static void main(String[] args){
        int[] a= {7,0,5,0,3};
        System.out.println("Increasing order");
        Q1(a);
        for(int i : a){// It is for each loop
            /*
             * for for loop
             * for(int i =0; i< a.length;i++)
             */
            System.out.print(i +" ");
            
        }
        System.out.println();
       
        String[] fruits = {"kiwi", "apple", "orange", "papaya", "mango"};
        Q2(fruits);
        for(String val : fruits)
{
    System.out.print(val +" ");
}        
    }
}