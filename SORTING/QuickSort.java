public class QuickSort {
    static void displayArr(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    static void swapArray(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int count = 0;

        for (int i = start + 1; i <= end; i++) {
            if (array[i] <= pivot) count++;
        }

        int pivotIndex = start + count;
        swapArray(array, start, pivotIndex);

        int i = start, j = end;

        while (i < pivotIndex && j > pivotIndex) {
            while (array[i] <= pivot) i++;
            while (array[j] > pivot) j--;

            if (i < pivotIndex && j > pivotIndex) {
                swapArray(array, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quicksort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(array, start, end);
        quicksort(array, start, pi - 1);
        quicksort(array, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 6, 8, 3};
        System.out.println("The array before sorting");
        displayArr(array);
        System.out.println();
        quicksort(array, 0, array.length - 1);
        System.out.println("The array after sorting");
        displayArr(array);
    }
}
