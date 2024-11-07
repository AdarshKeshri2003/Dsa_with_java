import java.util.Arrays;
import java.util.Scanner;

//Q1: program to find the number of the occurrence of the number inn an array
//Q2: program to find the last occurrence of the number in an array
//Q3: program to find the number strictly greater than the number
// Q4: program to find check  the given array is sorted or not
// sorted means  that in increasing order ort decreasing order
// Q5: program to find the smallest and largest element in the array

public class array5 {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    static int checkOccurrence(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] array, int x) {
        int lastplace = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == x) {
                lastplace = i;
            }
        }
        return lastplace;
    }

    static int strictlyGreater(int[] array, int x) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                number++;
            }
        }
        return number;
    }

    static boolean isSorted(int[] array) {
        boolean result = true;
        /*
         * i = 0
         * array[0]< array[-1]
         * is not possible
         */
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                // is not sorted
                result = false;
                break;
            }
        }
        return result;
    }

    static int[] smallestAndLargest(int[] array) {
        Arrays.sort(array);
        int[] ans = { array[0], array[array.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("har har mahadev");
        System.out.println("Enter the siz of thr array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The element is");
        printArray(array);
        System.out.println("Enter the x");
        int x = sc.nextInt();
        System.out.println("THe occurrence of the number in the array is " + checkOccurrence(array, x));
        System.out.println("THe last occurrence of the digit is " + lastOccurrence(array, x));
        System.out.println("The number strictly greater than the " + x + " is " + strictlyGreater(array, x));
        System.out.println("THE array is sorted " + isSorted(array));
        int[] ans = smallestAndLargest(array);
        System.out.println("Smallest " + ans[0]);
        System.out.println("Largest " + ans[1]);

    }
}