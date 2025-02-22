import java.util.*;
public class StringBuilder5{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");//Declaration of the string 
        System.out.println(str);
        str.append("world");//adding new string to the original String
        System.out.println(str);
        str.setCharAt(3,'M');//It is used to add a char to a particular index and remove the previous char at that index
        System.out.println(str);
        System.out.println();
        StringBuilder st1 = new StringBuilder("world");
        System.out.println(st1);
        st1.insert(2, 'M');//It is used to add a char at that index of the original string
        System.out.println(st1);
        st1.deleteCharAt(1);//It is used to delete the char at the particular index
        System.out.println(st1);
        System.out.println();
        StringBuilder st2 = new StringBuilder("physics");
        st2.reverse();//It is used to reverse the string
        System.out.println(st2);
        StringBuilder st3 = new StringBuilder("Alphabetical");
        st3.delete(1,5);//It is used to delete the char from i to j index => [i,j)
        System.out.println(st3);
    }
}