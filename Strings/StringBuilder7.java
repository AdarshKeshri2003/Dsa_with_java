
import java.util.*;
public class StringBuilder7{
    public static void main(String[] args) {
        //Given a string s, return the s is  palindrome or not.
        String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr +"";
        if(str.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        //m2
        String s1 = "abcdmnocba";
        int i =0;
        int j = s1.length()-1;
        boolean flag = true;// true-> means palindrome
        while(i<j){
            if(s1.charAt(i)!= s1.charAt(j)){
                flag = false;
                break;

            }
            i++;
            j--;
        }
            if( flag == true){
                System.out.println("Palindrome");
            }
            else{ 
                System.out.println("Not Palindrome");
            }
        

         // Given a string s , reutn the number of palindromic substrings in it.
        
        }
    }
