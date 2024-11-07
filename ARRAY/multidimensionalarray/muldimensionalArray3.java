import java.util.Scanner;
public class muldimensionalArray3{
    static void printArray(int[][] array){
        for(int i =0;i<array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q1 : Write the transpose of the given array.

    static void writeTranspose(int[][] array,int r, int c){
        int[][] transpose = new int[c][r];
        for(int i =0; i< c; i++){
            for(int j =0; j< r; j++){
                transpose[i][j] = array[j][i];
            }
        }
        printArray(transpose);
    }

    // transpose of gthe matrix without making a array
    static void transposeInPlace(int[][] array,int r,int c){
        // by swap[i][j] by swap[j][i]
        // this method is only useful foe square matrix
        for(int i =0; i< c; i++){
            for(int j =i; j<r; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
    //given a square matrix turn it by 90 degree in a clockwise direction 
    //without using any extra space
    // this method is only for square matrix
    static void reverseArray(int[] array){
        int i = 0; 
        int j =  array.length-1;
        while(i< j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] array, int r, int c){
        if( r !=  c){
            System.out.println("Enter the square matrix");
            return;
        }
        // transpose the matrix
        transposeInPlace(array, r, c);
        // then reverse each row of transposed array
        for(int i = 0; i< r; i++){
        reverseArray(array[i]);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        System.out.println("Enter the element");
        int[][] array = new int[r][c];
        for(int i =0; i<r ; i++){
            for(int j = 0; j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is ");
        printArray(array);
        System.out.println("The transpose of the matrix");
        writeTranspose(array, r, c);

        System.out.println("Transpose by InPAlce");
        transposeInPlace(array, r, c);
        printArray(array);

        System.out.println("THE ROTATED MATRIX IS");
        rotate(array, r, c);
        printArray(array);
    }
}