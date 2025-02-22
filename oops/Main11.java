//STATIC
public class Main11{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.schoolname = "DAV";
        System.out.println(s1.schoolname);
        s1.setname("ADARSH");
        System.out.println(s1.getname());

        Student1 s2 = new Student1();
        System.out.println(s2.schoolname);

        Student1 s3 = new Student1();
        s3.schoolname = " Gyan Bharthi";
        System.out.println(s1.schoolname);
        System.out.println(s2.schoolname);
        System.out.println(s3.schoolname);



    }
}
class Student1{
    String name;
    int roll;
    static String schoolname;

    static  int returnPercentage(int math, int chem, int phy){
        return (math + chem + phy)/3;
    }
    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}