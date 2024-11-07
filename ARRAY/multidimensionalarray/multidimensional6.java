import java.util.Scanner;
public class multidimensional6{
    static void printArray(int[][] array, int r , int c){
        for(int i = 0; i< r; i++){
            for(int j =0; j< c;j++){
            System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int[][] spiralMatrix(int r, int c){
        int[][] matrix = new int[r][c];
        int topRow= 0, rightCol = c -1, bottomRow = r-1, leftCol = 0;
        int totalElement = 1;
        while(totalElement <=r*c){
        //topRow -> leftCol to rightCol
        for(int j = leftCol; j<= rightCol && totalElement <= r*c; j++){
            matrix[topRow][j]  = totalElement;
            totalElement++;
        }
        topRow++;
        //rightCol-> topRow to bottomRow
        for(int j = topRow; j<= bottomRow && totalElement <= r*c; j++){
            matrix[j][rightCol] = totalElement;
            totalElement++;
        }
        rightCol--;
        //bottomRow -> rightCol to leftCol
        for(int j = rightCol; j>=leftCol && totalElement <= r*c; j--){
            matrix[bottomRow][j]= totalElement;
            totalElement++;
        }
        bottomRow--;
        //leftCol -> bottomRow to topRow
        for(int j = bottomRow; j >= topRow && totalElement <= r*c; j--){
            matrix[j][leftCol] = totalElement;
            totalElement ++;
        }
        leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the row of the matrix ");
        int r = sc.nextInt();
        System.out.println("enter the number of the column of the matrix ");
        int c = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[][] ans = spiralMatrix(r, c);
        printArray(ans, r, c);
    }
}