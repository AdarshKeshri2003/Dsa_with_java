class Pen {
    String color;
    String type;// ballpoint or gel

    // function
    public void write() {
        System.out.println("writing Something ");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printcolor();

        pen2.printcolor();

    }
}