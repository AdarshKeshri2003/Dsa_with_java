//This is hte method 2 of Quick Sort which is written by me as a practice code some of the code are chenges 
//output is correct
import java.util.Scanner;

public class QuickSort2 {
    static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(array, start, end);
        quickSort(array, start, pi - 1);
        quickSort(array, pi + 1, end);
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = start + count;
        swap(array, start, pivotIndex);

        int i = start;
        int j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(array, i, j);
            }
        }
        return pivotIndex;
    }

    static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Jai Chhathi Maiya");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Unsorted Array:");
        printArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
