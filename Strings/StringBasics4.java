import java.util.*;
public class StringBasics4{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        //s1 and s2 is created on the stack but it points the same Hello in the heap . 
        //It doesnot create another "Hello" for the s2 . It is known as INTERNING
        String s3 = new String("Hello");
        //But for s3 it  create a new space on  stack s well as heap
        System.out.println(s1 == s2);// It gives true because it points the same addresss
        System.out.println(s1 ==s3);// It return false because it does not ppint the same address
        System.out.println(s1.equals(s3));
    }
    
}