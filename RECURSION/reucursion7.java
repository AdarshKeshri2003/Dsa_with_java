/**
 * reucursion7 on STRING
 */
import java.util.Scanner;
public class reucursion7 {
    //Remove all the occurrences ofa from string
static void stringOccur(String s){
    //Iterative method
    for(int i =0; i < s.length(); i++){
        if(s.charAt(i) != 'a'){
            System.out.print(s.charAt(i));
        }
    }
}

static void stringOccur2(String s, int index){
    //base case
    if(index >=  s.length()){
        return;
    }
    //self work
    if(s.charAt(index) != 'a'){ 
        System.out.print(s.charAt(index));
    }
    // recursive work
    stringOccur2(s, index+1);
}


//Write a program to print reverse of a string using recursion
static String revStringI(String s){
    String ans = "";
    for (int i =s.length() -1; i >= 0; i--){
        ans += s.charAt(i);
    }
    return ans;
}

static String revStringR(String s, int index){
    //base case
    if(index ==s.length()){
        return "";
    }
    //self work
    //recursive work
   
    return revStringR(s,index +1) + s.charAt(index);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(s);// It will print the first word
        
        // for arr = {1,2,3,4,5} , for accessing the element arr[0]
        // for string
        char ch = s.charAt(0);
        System.out.println(ch);
        /*College
        0123456
        n = 7
        for finding the length of the arraywe use array.length

        but for String we use method .length()
        */
        System.out.println("All the element of the string-");
        for(int i =0; i <s.length(); i++){
            System.out.println(s.charAt(i));
            
        }
        System.out.println("Substring method");
            System.out.println(s.substring(2,5));// 2 is the beginning index which is inclusive and 5 is the ending index which is exclusive

            System.out.println("The enter without without having a");
            stringOccur(s);
            System.out.println();
            System.out.println("The given  word without having letter a by recursion method is");
            stringOccur2(s,0);
            System.out.println();
            System.out.println("Reversing the string ");
            System.out.println("Method 1 by iterative method is");
            System.out.println(revStringI(s));
            System.out.println("Method 2 by recursive method is");
            System.out.println(revStringR(s,0));


            // palindrome
            /*
             * level is a palindrome
             * but college is not palindrome because it is not same as from starting and from ending.
             * 
             */
    String rev = revStringR(s, 0);
    if(rev.equals(s)){
        System.out.println("Yhe string is palindrome");
    }
    else{
        System.out.println("The string is not palindrome");
    }
}           
}