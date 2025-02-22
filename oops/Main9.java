//ABSTRACT CLASS
public class Main9{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        

    }
}
 abstract class Animal{
        String color;
        Animal(){
            color = "Brown";
        }
         
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();// Implementation of this function is not given here
}
class Horse extends Animal{
    void change_color(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on l4 legs");
    }
}

class Chicken extends Animal{
    void change_color(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}