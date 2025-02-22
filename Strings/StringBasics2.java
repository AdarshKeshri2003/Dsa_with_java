import java.util.*;

public class StringBasics2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 ="abc";
        String s2 = "def";
        System.out.println(s1 + s2);
        System.out.println(s1 + 10);// the integer are read as string
        System.out.println(s1 + 'Z');
        System.out.println("abc" +"xyz");
        System.out.println("abc"+ 10 );
        System.out.println("abc" + 'R');
        System.out.println("abc"+20+30);
        System.out.println("abc"+(10+30));
        System.out.println(10+20+"abc");// first the int is added then converted to string 
        System.out.println((20+30)+ "abc");
        System.out.println("Substring function");
        String str = "abcdef";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(3));
    }
}