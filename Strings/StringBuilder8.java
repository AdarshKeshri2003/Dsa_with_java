import java.util.*;
public class StringBuilder8{
    static boolean isPalindrome(String s){
        int i =0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "abcdef";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j)) == true){
                    System.out.print(s.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("The number of Palindrome substring are "+ count);
    }
}