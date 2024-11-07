/**
 * oprators
 */
public class operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        // Arithmetic oprators
        System.out.println("ARITHMETIC OPERATORS");
        System.out.println(a + b);// 30
        System.out.println(a - b);// 10
        System.out.println(a * b);// 200
        System.out.println(a / b);// 2
        System.out.println(a % b);// 0
        System.out.println("RELATIONAL OPERATORS");
        // Relational opertor
        System.out.println(a == b);// false
        System.out.println(a != b);// true
        System.out.println(a > b);// true
        System.out.println(a < b);// false
        System.out.println(a >= b);// true
        System.out.println(a <= b);// false
        System.out.println("LOGICAL OPERATORS");
        System.out.println((a < b) && (a > b));// false
        System.out.println((a < b) || (a > b));// true

    }

}