//find the maximum and the second maximum element of the array 

import java.util.Scanner;

public class test3 {
    static void printArray(int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);

            
        }
    }
    static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
static int secMax(int[] array){
    int max= findMax(array);
    for (int i = 0; i < array.length; i++) {
        if(array[i] == max) {
            array[i] =Integer.MIN_VALUE;
        
    }
    
}int secondMax= findMax(array);
    return secondMax;
}

static int firstrepeat(int[] array){
    

    for(int i=0; i<array.length;i++){
        for(int j = i +1; j < array.length; j++){
            if(array[i] == array[j]){
                return array[i];
            }
        }   
    }
    return -1;
}


    public static void main(String[] args) {
        System.out.println("Hello World");
    System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int array[] = new int [n];
        System.out.println("Enter the element of hte array");
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("the array value");
        printArray(array);
        System.out.println("Maximum value is ");
        System.out.println(findMax(array));
        System.out.println(" sec Maximum value is ");
        System.out.println(secMax(array));
        System.out.println(firstrepeat(array));
}

}