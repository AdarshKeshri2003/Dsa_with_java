//Method overloading and Method overriding
public class Main8{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2, 3));
        System.out.println(calc.sum((float)1.56,(float)2.5));
        

        Deer d = new Deer();
        d.eat(); 
    
    }
}
//method overloading
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a , int b, int c){
        return a+ b + c;
    }
    float sum(float a, float b){
        return a + b;
    }
}

//method overiding
class Animal {
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}