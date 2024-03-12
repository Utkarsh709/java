class A{
static int x=10;
{

 System.out.println("object");
}
}
class B {
 public static void main(String args[]){
  A a=new A();
  a.x=5;
  System.out.println(a.x);
 }
}
