// lec 23
import java.util.Scanner;
public class multidimensionalArray7{
    static void printArray(int[][] matrix, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Q : Given an matrix 'a' of dimension r*c and 2 coordinats (l1, r1) ans (l2, r2). Return the sum of the rectangle from(11,r1) to (12,r2)
    /*
     * Given condition are
     * l2>= l1, r2>= r1
     * 0< li, l2<r 
     * 0<= r1, r2< c
     * 
     */
    // By method 1 Brute force 
    static int sumByBruteForce(int[][] matrix, int l1, int l2, int r1, int r2){
        int sum = 0;
        for(int i = l1 ; i<=l2; i++){
            for(int j = r1; j<=r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method 2 - Pre- Calulating horizontal sum for each row in the matrix
    //calculate row-wise and column-wise Prefix Sum
    // matrix[i][j]= sumRectangle (0,0) (i,j)
    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horizontally to calculate row-wisew prefix sum
        for(int i = 0; i< r; i++){
            for(int j =1; j< c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
// traverse vertically  to calculate column-wise prefix sum
    for(int j =0; j< c; j++){//fixing column
        for(int i = 1; i< r; i++){
        matrix[i][j] += matrix[i-1][j];
        }
    }
    }

    static int findSumM2(int [][] matrix, int l1, int l2, int r1, int r2){
    int sum =0;
    findPrefixSumMatrix(matrix);
    for(int i =l1; i<=l2; i++){
        // r1 to r2 sum for row1
        if(r1 >= 1){
        sum += matrix[i][r2]- matrix[i][r1-1];
    }
    else
        sum += matrix[i][r2];
}
    return sum;
    }

    static int findSum3(int[][] matrix, int l1, int l2, int r1, int r2){
        int ans = 0, sum =0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);
        sum = matrix[l2][r2];
        if(l1>=1){
        up = matrix[l1-1][r2];
        }
        if(r1>=1){
        left = matrix[l2][r1-1];
        }
        if(l1>=1 && r1>=1){
        leftUp = matrix[l1-1][r1-1];
        }
        ans = sum - up - left + leftUp;
        return ans;
    }
    
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int r = sc.nextInt();
        System.out.println("Enter the column of the matrix");
        int c = sc.nextInt();
        System.out.println("Enter the element of the matrix");
        int[][] matrix = new int[r][c];
        for(int i = 0 ; i < r ; i++){
            for(int j =0; j < c ; j++){
                matrix[i][j] = 1;
            }
        }
        System.out.println("Enter the boundaries of the mattrix");
        System.out.println("Enter l1");
        int l1 = sc.nextInt();
        System.out.println("Enter l2");
        int l2 = sc.nextInt();
        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();


        printArray(matrix, r, c);
        int ans = sumByBruteForce(matrix, l1, l2, r1, r2);
        System.out.println("Sum is " + ans);
        System.out.println(findSumM2(matrix, l1, l2, r1, r2));
        System.out.println("Rectangle Sum = " + findSum3(matrix, l1, l2, r1, r2));
        }
    }
    