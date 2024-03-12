class Overriding1{
 int balance=0;
 static String surname;
 static boolean status;
 public static void main(String args[]){
  Overriding1 son =new Overriding1();
  System.out.println(son);
  Overriding1 daughter=new Overriding1();
  System.out.println(daughter.fun(3,45,67,67,7,8,9));
 
 }
 
 public long fun(int.... b){
  System.out.println(b[0]);
  System.out.println(b[1]);
  System.out.println(b[2]);
  //System.out.println(b[3]);
  //System.out.println(b[-1]);
  
   return 0;
  
 }


}
