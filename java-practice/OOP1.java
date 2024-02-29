class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void colourType() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class OOP1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        pen1.colourType();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ball";
        pen2.write();
        pen2.colourType();
    }
}

