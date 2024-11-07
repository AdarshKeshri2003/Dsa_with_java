import java.util.Scanner;
public class multiDimensionalArray2{
    static void printArray(int[][] array){
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void additionArray(int[][] a, int r1, int c1, int[][] b , int r2, int c2){
        if( r1 != r2 || c1 != c2){
            System.out.println("Enter valid input size: the dimension of the matrix 1 and matrix 2 is not same");
            return;// agar r1 == r2 or c1 == c2nhi hua to yahi khatam ho jayega

        }
        int[][] sum = new int[r1][c1];//r1 == r2 and c1 == c2 
        for(int i = 0; i< r1; i++){
            for(int j =0 ; j< c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }

    static void multiplyArray(int[][]a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible- Wrong dimension");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i = 0; i<r1; i++){
            for(int j =0; j< c2; j++){
                for(int k =0; k< c1;k++){// c1 =r2
                    /*
                    mul[i][j] ; multiplication of ith row of matrixA and jth column of matrix b
                     */
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(mul);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter matrix 1");
        
        System.out.println("Enter the row for the  matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter the column for the matrix 1");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the element of the matrix 1");
        for(int i = 0;i < r1;i++){
            for(int j = 0; j< c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix 1 is");
        printArray(a);
        System.out.println("Enter matrix 2");
        
        System.out.println("Enter the row for the  matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter the column for the matrix 2");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the element of the matrix 2");
        for(int i = 0;i < r2;i++){
            for(int j = 0; j< c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The matrix 2 is");
        printArray(b);
        System.out.println("The sum of the matrix is");
        additionArray(a, r1, c1, b, r2, c2);
        System.out.println("The multiplication of the matrix 1 and matrix 2");
        multiplyArray(a, r1, c1, b, r2, c2);
    }
}