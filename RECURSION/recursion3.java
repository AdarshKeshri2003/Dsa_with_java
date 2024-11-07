import java.util.Scanner;

public class recursion3 {
    // Q Given an integer, find out the sum of its digits
    static int sum(int n) {
        if (n / 10 == n) {
            // n/10 or (n>=0 && n <=9)
            return n;
        }
        return sum(n / 10) + n % 10;
    }

    //Returm the count of digit  in a given number n
    static int count(int n) {
        if ( n>=0 && n <=9) {
            // n/10 or (n>=0 && n <=9)
            return 1;
            
        }
        return count(n / 10) + 1;
    }
//Given two number p and q find the calue of p^q using recursion
// method 1
    static int pow( int p,int q) {
        if ( q ==0) {
            // n/10 or (n>=0 && n <=9)
            return 1 ;
            
        }
        return pow(p,q-1) * p;
    }
//Method 2 
    static int pow2( int p,int q) {
        if ( q ==0) {
            // n/10 or (n>=0 && n <=9)
            return 1;
            
        }
        if(q %2 == 0) {
            int smallAns = pow2(p,q/2);
            return smallAns* smallAns;
        }
        else{
            int smallAns = pow2(p,q/2);
            return smallAns* smallAns*p;
        }
    }
    public static void main(String[] args) {

        System.out.println("Har Har Mahadev");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of the digits");
        System.out.println(sum(n));

        System.out.println("The COUNT of the digits");
        System.out.println(count(n));
        System.out.println("Enter p");
        int p = sc.nextInt();
        System.out.println("Enter q");
        int q = sc.nextInt();
        System.out.println("the p to the power of q by method 1");
        System.out.println(pow(p,q));
        System.out.println("the p to the power of q by method 2");
        System.out.println(pow2(p,q));

    }
}