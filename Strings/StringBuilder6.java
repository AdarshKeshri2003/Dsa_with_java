import java.util.*;
 
public class StringBuilder6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Given a String the taski is to toggle all the characters of the string.
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        // toggle
        //PHysics -> phYSics
        for(int i =0 ; i<sb.length();i++){
            //P->p
            //check -> alphabet small to capital
            boolean flag = true; // true means capital
            char ch = sb.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;// it will give the ascii value of the alphabet
            if(asci >= 97){
                flag = false; // It is the small alphabet
            }
            if( flag == true){ // It is the big alphabet
                asci += 32;// it will covert int to small alphabet
                //example: (A)65 +2 = 97(a)
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
            else{//small
                asci -= 32;
                char dh =(char)asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);

        //Method 2 
        // By using String
        String str = "PhysICS";
        for(int i = 0; i< str.length();i++){
            boolean  flag = true;
            char ch = str.charAt(i);
            if(ch ==' ') continue;
            int asci = (int)ch;
            if(asci >= 97){
                flag = false; // It is the small alphabet
            }
            if( flag == true){ // It is the big alphabet
                asci += 32;// it will covert int to small alphabet
                //example: (A)65 +2 = 97(a)
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1,str.length());
            }
            else{//small
                asci -= 32;
                char dh =(char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1,str.length());
            }
        }
            System.out.println(str);

        }

    }
