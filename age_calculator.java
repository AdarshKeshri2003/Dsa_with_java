
import java.util.Scanner;

/**
 * age_calculator
 */
public class age_calculator {

    public static void main(String[] args) {
        System.out.println("Age Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Today's Date ");
        int tdate = sc.nextInt();
        System.out.print("Enter the Today's Month ");
        int tmonth = sc.nextInt();
        System.out.print("Enter the Today's Year ");
        int tyear = sc.nextInt();
        System.out.print("Today's date : " );
        System.out.println(tdate+ "/" + tmonth + "/"+ tyear) ;
        System.out.print("Enter the Birth Date ");
        int bdate = sc.nextInt();
        System.out.print("Enter the Birth Month ");
        int bmonth = sc.nextInt();
        System.out.print("Enter the Birth Year ");
        int byear = sc.nextInt();
        System.out.print("Today's date : " );
        System.out.println(bdate+ "/" + bmonth + "/"+ byear) ;
        int date = 0;
        int month =0;
        int year = 0;
        if (bmonth %2 == 0 && bmonth<= 12) {
             date = 30 - bdate + tdate;
             month = 12 - bmonth + tmonth -1;
             year = tyear - byear -1;
             if(date >30){
                month += 1;
                date -=30;
                
             }
             if(month > 12){
                year += 1;
                month -=12;
             }
            }
        else if(bmonth %2 != 0 && bmonth<= 12){
            date = 31 - bdate + tdate;
             month = 12 - bmonth + tmonth -1;
             year = tyear - byear -1;
             if(date >31){
                month += 1;
                date -=31;
                
             }
             if(month > 12){
                year += 1;
                month -=12;
             }
        }
        else if(bmonth == 2 ){
            date = 28 - bdate + tdate;
             month = 12 - bmonth + tmonth -1;
             year = tyear - byear -1;
             if(date >28){
                month += 1;
                date -=28;
                
             }
             if(month > 12){
                year += 1;
                month -=12;
             }
             
        }
        System.out.println(date+"/" + month +"/"+ year);



            
        }



    }
