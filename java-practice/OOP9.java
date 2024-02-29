// heirerchial  Inheritance
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

class circle extends shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class OOP9{
    public static void main(String[] args) {
      Triangle t1=new Triangle();
      t1.area();
      t1.area(4,7);
      
      circle c1=new circle();
      c1.area();
      c1.area(5);
    }
}

