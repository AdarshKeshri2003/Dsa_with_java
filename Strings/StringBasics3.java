public class StringBasics3{
    public static void main(String[] args){
        System.out.println("Hello");
        String s = "Alphabet";
        for(int j = 2; j< 4;j++){
            System.out.println(s.substring(j));
        }
        String str ="abcd";
        for(int i =0; i<= str.length();i++){
            for(int j = i; j<= str.length();j++){

                System.out.print(str.substring(i,j) +" ");
            }
        }
    }
}