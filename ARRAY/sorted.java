import java.util.Scanner
;public class sorted{
    static void printArray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }System.out.println();
    }
//method 1 of sorting 0 and 1
    static void zeroesandones(int[] array){
        int ans = 0;
        for(int i = 0;i<array.length;i++){
        
            if(array[i]==0){
                ans++;
        }
        }
        // 0 to ans-1:0; ans to n-1 : 1
        for (int i = 0; i <array.length; i++) {
            if(i<ans){
                array[i] =0;
            }
            else{
                array[i] =1;
            }
    }
}
static void swap(int a, int b){
    int temp = a;
    a = b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    
}

static void swaparray(int[] array){
    for(int i =0;i<array.length;i++){
        for(int j = i+1;j<array.length;j++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

//method 2 of sorting 0 and  i
// ye function run nhi ho rha h 
static void zeroesandonesBySwap(int[] array){
    int left = 0;
    int right = array.length-1;
    while(left<right){
        if(array[left] == 1 && array[right] == 0){
            swap(left,right);
            left ++;
            right --;
        }
        if(array[left] ==0 ){
            left++;
        }
        if(array[right]== 1){
            right--;
        }
    }

}


    public static void main(String[] args){
        System.out.println("Har Har Mahadev");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of the array ");
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();

        }
        zeroesandones(array);
        System.out.println("The array which 0 is first then 1(sorted) ");
        printArray(array);
        swaparray(array);
        System.out.println("swapping the sorted array");
        printArray(array);
        
        System.out.println("AFTER SWAPPING element");
        swap(5,10);
       
        //zeroesandones(array);
        //System.out.println("Sorted array is");
        //printArray(array);
        
    }
}