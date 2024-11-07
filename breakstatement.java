
public class breakstatement {

    public static void main(String[] args) {

        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found answer" + num);
                break;// if we dont apply break it it output become endless
            }
            num++;
        }
    }
}