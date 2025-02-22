//INHERITANCE

public class Main4{
    public static void main(String[] args){
        Dog tommy = new Dog();
        tommy.eat();
        tommy.breathe();
        tommy.barks();
    }
 }
 //Base or Parent Class
 class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
 }

 //Derive or Child Class
 class Dog extends Animal{
    int legs;
    void barks(){
        System.out.println("Barks");
    }
    

 }