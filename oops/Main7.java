//INRITANCE 
// HYBRID INHERITANCE
public class Main7{
    public static void main(String[] args) {
        Tuna t1 = new Tuna();
        t1.eat();
        t1.breathe();
        t1.size();

        Shark s1 = new Shark();
        s1.eat();
        s1.breathe();
        s1.carnivores();


        Peacock p1 = new Peacock();
        p1.eat();
        p1.breathe();
        p1.fly();
        p1.dance();

        Sparrow sp1 = new Sparrow();
        sp1.eat();
        sp1.breathe();
        sp1.fly();
        sp1.small();


        Dog d1 = new Dog();
        d1.eat();
        d1.breathe();
        d1.walk();
        d1.bark();

        Human h1 = new Human();
        h1.eat();
        h1.breathe();
        h1.walk();
        h1.work();

    }
}
//Base class
class Animal{
    void eat(){
        System.out.println("Animal is eating.... ");
    }
    void breathe(){
        System.out.println("Animal is Breathing....");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Fish is swimming...");
    }
}
class Tuna extends Fish{
    void size(){
        System.out.println("The is size is big..");
    }
}
class Shark extends Fish{
    void carnivores(){
        System.out.println("Shark is a carnivores..");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying very high...");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("Peacock is dancing in the rain...");
    }
}
class Sparrow extends Bird{
    void small(){
        System.out.println("Sparrow is a small bird.......");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Mammal is walking..");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog is barking....");
    }
}
class Human extends Mammal{
    void work(){
        System.out.println("Human is working");
    }
}