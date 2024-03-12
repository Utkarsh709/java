class Overriding3{
 int balance=0;
 static String surname;
 static boolean status;
 public static void main(String args[]){
  Overriding3 son =new Overriding3();
  System.out.println(son);
  Overriding3 daughter=new Overriding3();
  System.out.println(daughter.fun(3,"SGGS",56,7,4));
 
 }
 
 public int fun(int a,String s,int...b){
  System.out.println(a);
  //System.out.println(c);
  System.out.println(s);
  System.out.println(b[0]);
  System.out.println(b[1]);
  System.out.println(b[2]);
  System.out.println(b[3]);
  System.out.println("utkarsh:"+b.length);
  
   return 0;
  
 }


}
