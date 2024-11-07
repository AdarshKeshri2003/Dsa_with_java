import java.util.Scanner;
public class recursion2{
    //find the factorial of n using recursion 
    static int factorial(int n){
        
        //n =5
        //base case
        if(n == 0)
        return 1;


        // subproblem (recursive relation)
        int smallans = factorial(n-1);// factorial(4) = 24
        // self work 
        int ans = n * smallans;// n * factorial
        return ans;
        // another method to write from  line 10 to 13 we can compress 
        //return n * factorial(n-1);
    }

    // Program to find the nth  fibonacci number
    static int fibonacci(int n) {
        if(n ==0 || n ==1){// base case
            return n;
        }
        // subproblem - recurssive relation

      // self work
        return fibonacci(n-1) + fibonacci(n-2);
        
    }
    public static void main(String[] args){
        System.out.println("Har Har Mahadev");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        System.out.println("the factorial of n ");
        System.out.println(factorial(n));
        System.out.println("fibonacci:  " + fibonacci(n));
        System.out.println(" n fibonacci number");
        for(int i =0; i<= 10; i++){
            System.out.println(fibonacci(i));
    }
    }
}