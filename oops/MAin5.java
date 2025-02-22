//Inheritance 
//MULTI LEVEL INHERITANCE

public class MAin5{
    public static void main(String[] args){
        Dog tommy = new Dog();
        tommy.eat();
        tommy.breathe(); 
        tommy.speak();
        tommy.walk();
        tommy.color = "red";
        tommy.hand = 0;
        tommy.legs = 4;
        System.out.println(tommy.color);
        System.out.println(tommy.hand);
        System.out.println(tommy.legs);
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
 class Mammal extends Animal{
    int hand;
    void speak(){
        System.out.println("Sounds");
    }
 }
 //Second Derive class 
  class Dog extends Mammal{
    int legs;
    void walk(){
        System.out.println("The dog is walking");
    }
  }