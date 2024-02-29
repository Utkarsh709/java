//single inheritance
class shape{
 public void area(){
  System.out.println("display area");
 }
}

class triangle extends shape{
 public void area(int l,int h){
  System.out.println(0.5*l*h);
 }
}

public class OOP7{
 public static void main(String[] args){
  triangle t1=new triangle();
  t1.area();
  t1.area(3,5);
 }
}
