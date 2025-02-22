public class Main1 {
    public static void main(String[] args){
     Pen pen1 = new Pen();//created a pe object called p1
     pen1.setColor("Blue");
     System.out.println(pen1.getColor());
     pen1.setTip(5);
     System.out.println(pen1.getTip());

    BankAccount myAcc = new BankAccount();
    myAcc.name = "Adarsh";
    myAcc.setPassword("abccdef");

    System.out.println("Student");
    Student S1 = new Student();
    S1.age = 21;
    S1.name ="Bhole";
    System.out.println(S1.age);
    System.out.println(S1.name);
    }

}
class BankAccount{
    public String name;
    private String password;
    public void setPassword(String pwd){
        password = pwd;    
    }
}
class Pen{
    private String color;
    private int tip;
    //getter
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    //setter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}