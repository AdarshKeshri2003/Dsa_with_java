//find the no of pair whiose sum of the two element is x

import java.util.Scanner;

public class test2 {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int sum(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    static int triplesum(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int z = j + 1; z < array.length; z++) {
                    if (array[i] + array[j] + array[z] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // 3
    static void unique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = 0;
                    array[j] = 0;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        printArray(array);
        System.out.println("Enter the target ");
        int target = sc.nextInt();
        System.out.print("The double sum number pair is ");
        System.out.println(sum(array, 7));
        System.out.print("The triple sum number pair is ");
        System.out.println(triplesum(array, target));
        System.out.println("Unique element is");
        unique(array);
    }

}
