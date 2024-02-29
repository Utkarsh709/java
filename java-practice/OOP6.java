// Inheritance
class Shape {
    String color;

    public void printColor() {
        System.out.println(this.color);
    }
}

class Triangle extends Shape {
    // You can add additional properties or methods specific to the Triangle class here.
}

public class OOP6 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printColor();
    }
}

