class Overriding{
 int balance=0;
 static String surname;
 static boolean status;
 public static void main(String args[]){
  Overriding son =new Overriding();
  System.out.println(son);
  Overriding daughter=new Overriding();
  System.out.println(daughter.fun(daughter));
 
 }
 
 public long fun(Overriding b){
  System.out.println(b);
  return b.balance;
  
 }


}
