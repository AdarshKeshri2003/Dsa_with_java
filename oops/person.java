public class person {
    //class creation
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    

    public static void main(String[] args) {
      // object creatio
      Student s1 = new Student();
      s1.name = "Adarsh";
      s1.rno = 5;
      s1.percent = 99.33;
      System.out.println(s1.name);
      System.out.println(s1.rno);
    }
}