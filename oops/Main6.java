
//Hierarchial Inheritance
public class Main6{
    public static void main(String[] args){
        Human man = new Human();
        man.color = "brown";
        System.out.println(man.color);
        man.eat();
        man.breathe();
        man.legs = 2;
        man.walk();
        Fish f1 = new Fish();
        f1.color = "black";
        System.out.println(f1.color);
        f1.eat();
        f1.breathe();
         f1.eyes= 2;
         System.out.println(f1.eyes);
        f1.swim();
        Bird sparrow = new Bird();
        sparrow.color = "yellow";
        System.out.println(sparrow.color);
        sparrow.eat();
        sparrow.breathe();
        sparrow.lungs = 2;
        System.out.println(sparrow.lungs);
        sparrow.fly();
        

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
 class Human extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammal is walking");
    }
 }
 class Fish extends Animal{
    int eyes;
    void swim(){
        System.out.println("Fish is swimming");
    }
 }
 class Bird extends Animal{
    int lungs;
    void fly(){
        System.out.println("Bird is flying");
    }
 }