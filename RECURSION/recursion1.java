import java.util.Scanner;

public class recursion1 {
    static void printIncreasing(int n) {
         if(n == 1){
         System.out.print("1 ,");
         return;
         }
        printIncreasing(n - 1);
        System.out.print(n + ", ");
    }

    //writ a program to print all natural number from n to n using recursion.
    static void printNaturalNumber(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }
        printNaturalNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println("Har Har Mahadev");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        System.out.println("NATURAL NUMBER");
        printNaturalNumber(10);
    }
}