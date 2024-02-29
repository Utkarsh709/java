// Multi-level Inheritance
class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Equilateral extends Triangle {
    public void area(int l) {
        System.out.println(0.433 * l * l);
    }
}

public class OOP8{
    public static void main(String[] args) {
        Equilateral e1 = new Equilateral();
        e1.area();         // Calling the area() method from the Shape class
        e1.area(4, 7);     // Calling the area(int l, int h) method from the Triangle class
        e1.area(3);        // Calling the area(int l) method from the Equilateral class
    }
}

