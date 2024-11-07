//GCD
import java.util.Scanner;
public class recursion5 {
    static int igcd(int x, int y){
        while( x%y != 0){//loop kab tak chalega
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
        
    }

    static int recGCD(int x, int y){
        if(y ==0){
            return x;
        }
        return recGCD(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int x = sc.nextInt();
        System.out.println("Enter the second value");
        int y = sc.nextInt();
        int min = Math.min(x, y);
        //Brute Force Method
        for(int i =min; i >= 1; i--){
            if((x % i ==  0) && (y % i == 0)){
                System.out.println("The greatest common divisor of"+ x +" and "+ y+ "is " + i);
                break;
            }
        }
        
        //Iterative method 
       
        int k =igcd(x,y);
        System.out.println("The greatest common divisor of"+ x +" and "+ y+ "is " + k);
            // by recursion
        System.out.println("The greatest common divisor of"+ x +" and "+ y+ "is " + recGCD(x, y));

        

        int LCM = ((x * y) / recGCD(x,y) );
        System.out.println("The LCM of"+ x +" and "+ y+ "is " + LCM);
    }
    
}
// the below is for main part
// break keyword use karne se particular loop terminate hoti h .
//continue keyword is use to continue the loop excaping  the particular line
// return keyword is use to end the main part of the code that menas the termination of the process