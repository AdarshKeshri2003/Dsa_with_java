import java.util.Scanner;
public class recursion4{
    //Given two number num and a value k . Print first k multiple of num 
    static void multiple(int n, int k ){
        ///Base case
        if(k ==1){
            System.out.println(n);
            return;
        }
        //subproblem
        multiple(n, k-1);
    //selfwork
        System.out.println(n*k);
    }

    // find the sum of first natural number n
    static int sum(int n ){
        //base case
        if(n ==1 )
        return 1;
        // recursive work + selfwork
        return sum(n -1) + n;
    }

    // find the sum of first natural number n with alternative sign
    static int alternatesignsum(int n){
        //base case
        if(n ==0 )
        return 0;
        // recursive work + selfwork
        if(n % 2 == 0){//n is odd
        return alternatesignsum(n -1) -n;}
        else{
            return alternatesignsum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number kto get the multiple ");
        int k = sc.nextInt();
        System.out.println("The first k multiple of n are");
        multiple(n, k);
        System.out.println("The sum of first n natural number is ");
        System.out.println(sum(n));
        System.out.println("The sum of first n natural number with alternate sign is ");
        System.out.println(alternatesignsum(n));
        
    }
}