public class Main2 {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student("ADARSH");
        System.out.println(S2.name);
        Student S3 = new Student(11);
        System.out.println(S3.roll);

        Student S4 = new Student();
        S4.name = "Ram";
        S4.roll = 11;
        //copied constructed object
        Student S5 = new Student(S4);
        System.out.println(S5.name);
        System.out.println(S5.roll);
    }
}


class Student {
    String name;
    int roll;

    // Constructor
    Student(){
        System.out.println("Constructor is called");
    }
    // Parametrised constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }

    //Copy constructor
    Student(Student S4){
        this.name = S4.name;
        this.roll = S4.roll;
    }
}
