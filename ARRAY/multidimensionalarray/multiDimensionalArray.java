import java.util.Scanner;
public class multiDimensionalArray{
    static void prrintArray(int[][] array){
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Har Har MAhadev");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the columns");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
            System.out.println("Enter the array" + r*c + "element");
        for(int i = 0; i< r;i++){
            for(int j = 0; j< c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("the element of the array are ");
        prrintArray(array);
    }
}