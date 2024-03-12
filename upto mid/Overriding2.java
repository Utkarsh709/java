class Overriding2{
 int balance=0;
 static String surname;
 static boolean status;
 public static void main(String args[]){
  Overriding2 son =new Overriding2();
  System.out.println(son);
  Overriding2 daughter=new Overriding2();
  System.out.println(daughter.fun(3,45,6,5,8,9));
 
 }
 
 public int fun(int a,int...b,int c){
  System.out.println(a);
  System.out.println(c);
  System.out.println(d);
  System.out.println(b[0]);
  System.out.println(b[1]);
  System.out.println(b[2]);
  System.out.println("utkarsh:"+b.length);
  
   return 0;
  
 }


}
