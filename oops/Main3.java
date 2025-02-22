//NOT GETTING THE OUTPUT 
// LEC NO. 8 AND 9
// CONSTRUCTOR TOPIC 
public class Main3{
    public static void main(String[] args) {
        System.out.println("Hello");
        Student s1 = new Student();
        s1.name= "Adarsh";
        s1.roll = 11;
        s1.marks[0]=100;
        s1.marks[1] = 90;
        s1.marks[2]= 80;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        for(int i =0; i< 3; i++){
            System.out.println(s1.marks[i]);
        }
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        for(int i =0; i< 3; i++){
            System.out.println(s2.marks[i]);
        }
        
        }
    }
    class Student{
        String name;
        int roll;
        int marks[];
        
        //Shallow copy costructor 
  /*       Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
           
        }
*/
        //deep copy constructor
            Student(Student s1){
                marks = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                for(int i =0; i< marks.length;i++){
                 this.marks[i] = s1.marks[i];

                }
            }
        Student(){
            marks = new int[3];
            System.out.println("Coonstructor is called..");
        }
        Student(String name){
            marks = new int[3];
            this.name = name;
        }
        Student(int roll){
            marks = new int[3];
            this.roll = roll;
        }
    }
    
    