/*
 * write an efficient algorithm that earches for a value in n x m integer 
 * matrix .This matrix has the following properties:
 * -> Integer in each row are sorted in ascending from left to right
 * -> Integer in each column are sorted in ascending from top to bottom
 *  
 */
public class binarySearch4{
    // LOGIC 
    /*
     * array ka a[0][m-1] se start karege aur check karege agar target mil gya to 
     * return kar denge nhi mila to check karege ki target agar chota h to j --
     * karege nhi to agar target badha hua to i ++ karege
     */
    static boolean search(int[][] a, int target){
        int n = a.length;
        int m = a[0].length;
        int i =0 ;
        int j = m-1;
        while(i<n && j >=0){
            if(target == a[i][j]){
                return true;
            }
            else if(target < a[i][j]){
                j--;
            }
            else{
                i++;
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        int a[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        System.out.println(search(a,4));
        System.out.println(search(a,100));
    }
}