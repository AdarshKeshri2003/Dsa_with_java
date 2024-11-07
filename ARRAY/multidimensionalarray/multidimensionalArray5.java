import java.util.Scanner;
public class multidimensionalArray5{
    static void printArray(int[][] array, int r , int c){
        for(int i = 0; i< r; i++){
            for(int j =0; j< c;j++){
            System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
    //Q Spiral matrix
    static void spiralMatrix(int[][] array, int r, int c ){
        int topRow= 0, rightCol = c -1, bottomRow = r-1, leftCol = 0;
        int totalElement = 0;
        while(totalElement <r*c){
        //topRow -> leftCol to rightCol
        for(int j = leftCol; j<= rightCol && totalElement < r*c; j++){
            System.out.print(array[topRow][j] + " ");
            totalElement++;
        }
        topRow++;
        //rightCol-> topRow to bottomRow
        for(int j = topRow; j<= bottomRow && totalElement < r*c; j++){
            System.out.print(array[j][rightCol] + " ");
            totalElement++;
        }
        rightCol--;
        //bottomRow -> rightCol to leftCol
        for(int j = rightCol; j>=leftCol && totalElement < r*c; j--){
            System.out.print(array[bottomRow][j] + " ");
            totalElement++;
        }
        bottomRow--;
        //leftCol -> bottomRow to topRow
        for(int j = bottomRow; j >= topRow && totalElement < r*c; j--){
            System.out.print(array[j][leftCol] + " ");
            totalElement ++;
        }
        leftCol++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the row of the matrix ");
        int r = sc.nextInt();
        System.out.println("enter the number of the column of the matrix ");
        int c = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[][] array = new int[r][c];
        for(int i = 0; i< r; i++){
            for(int j =0; j< c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        printArray(array,r,c);
        System.out.println("Spiral MAtrix");
        spiralMatrix(array, r, c);
    }
}