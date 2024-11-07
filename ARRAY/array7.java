import java.util.Scanner;

/**
 * array7
 */
// Q1: find the unique number in the array where all the element are being
// repeated twice with one value being unique
// Q2: find the second largest number in the array
// Q3: Given an array a consisting of the integer .REturn the first value which is
// repeating in this array.If no value is repeated return -1

public class array7 {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int findunique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                ans = array[i];
            }
        }
        return ans;
    }

    static int largestNum(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int secondLargest(int[] array) {
        int max = largestNum(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = largestNum(array);
        return secondMax;
    }

    static int firstRepititive(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(array[j] == array[i]){//found answer
                    return array[i];//return use karne se pura method khatam ho jata h aur break us ekrane bas vahi rukta h
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thw size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("ENter the element of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        printArray(array);
        System.out.println("The unique value is: " + findunique(array));

        // System.out.println("The second largest number in the array is " +
        // secondLargest(array));
    System.out.println("The first repetiitve number is "+ firstRepititive(array));// answer nhi aa rha h
    }
}