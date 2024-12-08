//The basics of the Strings
import java.util.*;
public class StringsBasics{
    public static void main(String[] args){
        System.out.println("Hlo");
        Scanner sc = new Scanner(System.in);
        String st ="Hello World";
        System.out.println(st);
        //String st1 = sc.next();// It is used to print only first word
        //System.out.println(st1);
        //String st2 = sc.nextLine();//It is used to print the whole sentence
        //System.out.println(st2);
        String st2= "Adarsh Kumar";
        System.out.println("CharAt() function ");
        System.out.println(st2.charAt(3));//It is used to find the character the particular index
        System.out.println(st2.charAt(0));
        System.out.println("length() function ");
        System.out.println(st2.length());//It is used to find the length of the string 
        System.out.println("indexOf() function ");
        System.out.println(st2.indexOf('a'));//It is used to give the index of the particular character
        String str = "Hello";
        String gtr = "Dello";
        System.out.println("compareTo() function ");
        System.out.println(str.compareTo(gtr));
        System.out.println(gtr.compareTo(str));
        //lexographically which means it check the letter by letter of both the words if the position of the letter in the alphabetical squence check a
        System.out.println("contains() function ");
        System.out.println(st2.contains("rsh"));//It si used to check whether the part of the string is present  in the string or not 
        System.out.println("startsWith() function ");
        System.out.println(st2.startsWith("Adar"));//It is used to check that the particular  string is starting for or not
        System.out.println("endsWith() function ");
        System.out.println(st2.endsWith("mar"));//It is used to check whether the part of the string is ended or not
        System.out.println("toUpperCase() function ");
        System.out.println(st2.toUpperCase());//convert all the string into upper case
        System.out.println("toLowerCase() function ");
        System.out.println(st2.toLowerCase());//convert all the string into Lower case
        System.out.println("concat() function ");
        String s1 = "abc";
        String s2 = "xyz";
        System.out.println(s1.concat(s2));//it is used to add the two different string 
        System.out.println(s2.concat(s1));

    }
}