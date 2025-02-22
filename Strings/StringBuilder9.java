public class StringBuilder9{
    public static void main(String[] args) {
        //Java Program to reverse each word in String 
        String str = "I am Adarsh Kumar Keshri";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!= ' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0, str.length());
            }
        }
        System.out.println(ans);
    }
}